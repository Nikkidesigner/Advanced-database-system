import java.io.*;
import java.net.*;

class subordinate {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Socket s = new Socket("localhost", 4545);  // Connect to coordinator at localhost on port 4545
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        // Receive "prepare" message from coordinator
        String in = dis.readUTF();
        System.out.println("Received " + in + " message.");

        // Respond with "yes" or "no"
        System.out.println("Subordinate ready: 'yes' or 'no':");
        String out = br.readLine();
        dos.writeUTF(out);  // Send the response
        dos.flush();  // Ensure message is sent immediately

        // Receive either "commit" or "abort" from coordinator
        in = dis.readUTF();
        System.out.println("Received " + in + " message.");

        // Send acknowledgment after commit or abort
        if (in.equalsIgnoreCase("commit") || in.equalsIgnoreCase("abort")) {
            out = "ack";
            System.out.println("Sending acknowledgment.");
            dos.writeUTF(out);  // Send acknowledgment
            dos.flush();  // Ensure message is sent immediately
        }

        // Close the socket after communication is complete
        dis.close();
        dos.close();
        s.close();
        System.out.println("Subordinate process completed.");
    }
}
