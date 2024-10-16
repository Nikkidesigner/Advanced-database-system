import java.io.*;
import java.net.*;

class coordinate {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ServerSocket ss = new ServerSocket(4545);  // Server listens on port 4545
        System.out.println("\nEnter No. of Subordinates:");
        int cnt = Integer.parseInt(br.readLine());  // Number of subordinates
        
        Socket[] s = new Socket[cnt];
        DataInputStream[] dis = new DataInputStream[cnt];
        DataOutputStream[] dos = new DataOutputStream[cnt];
        
        // Accept connections from subordinates
        for (int i = 0; i < cnt; i++) {
            s[i] = ss.accept();
            System.out.println("Subordinate " + (i+1) + " connected.");
            dis[i] = new DataInputStream(s[i].getInputStream());
            dos[i] = new DataOutputStream(s[i].getOutputStream());
        }

        // Send "prepare" message to all subordinates
        String pr = "prepare";
        System.out.println("Sending prepare message to all subordinates.");
        for (int i = 0; i < cnt; i++) {
            dos[i].writeUTF(pr);
            dos[i].flush();  // Ensure data is sent immediately
        }

        String[] responses = new String[cnt];
        boolean commit = true;

        // Receive response from subordinates
        for (int i = 0; i < cnt; i++) {
            responses[i] = dis[i].readUTF();  // Wait for subordinate's response
            System.out.println("Received from Subordinate " + (i+1) + ": " + responses[i]);
            if (responses[i].equalsIgnoreCase("no")) {
                commit = false;
            }
        }

        // Send "commit" or "abort" message based on responses
        String decision = commit ? "commit" : "abort";
        System.out.println("Sending " + decision + " message.");
        for (int i = 0; i < cnt; i++) {
            dos[i].writeUTF(decision);
            dos[i].flush();  // Ensure message is sent immediately
        }

        // Wait for acknowledgments from all subordinates
        for (int i = 0; i < cnt; i++) {
            String ack = dis[i].readUTF();
            System.out.println("Acknowledgment received from Subordinate " + (i+1) + ": " + ack);
        }

        // Close all connections
        for (int i = 0; i < cnt; i++) {
            dis[i].close();
            dos[i].close();
            s[i].close();
        }
        ss.close();  // Close server socket
        System.out.println("Coordinator process completed.");
    }
}
