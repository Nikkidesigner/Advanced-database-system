# Advanced Database Systems Project

## Table of Contents
1. [Project Overview](#project-overview)
2. [Technologies Used](#technologies-used)
3. [Concepts Covered](#concepts-covered)
   - [1. Relational Database Implementation](#1-relational-database-implementation)
   - [2. Fragmentation and Replication Schemas](#2-fragmentation-and-replication-schemas)
   - [3. Two-Phase Commit Protocol](#3-two-phase-commit-protocol)
   - [4. Partitioning Queries on Parallel Databases](#4-partitioning-queries-on-parallel-databases)
   - [5. Parallel Joins, Sorting, and Aggregates](#5-parallel-joins-sorting-and-aggregates)
   - [6. Oracle Utilities](#6-oracle-utilities)
   - [7. SQL Functions in PL/SQL](#7-sql-functions-in-plsql)
   - [8. Procedures in PL/SQL](#8-procedures-in-plsql)
   - [9. Cursors in PL/SQL](#9-cursors-in-plsql)
   - [10. Triggers in PL/SQL](#10-triggers-in-plsql)
   - [11. SQL Sequence and View](#11-sql-sequence-and-view)
   - [12. OLAP Operations and Cube Operator](#12-olap-operations-and-cube-operator)
4. [Installation](#installation)
5. [Usage](#usage)
6. [Contributing](#contributing)
7. [License](#license)

## Project Overview
This project aims to explore various advanced concepts in database systems, specifically focusing on relational databases, distributed systems, and OLAP operations. The project involves implementing and demonstrating various features through a series of tasks.

## Technologies Used
- Oracle Database
- SQL
- PL/SQL
- Java (for distributed database tasks)
- Git (for version control)

## Concepts Covered

### 1. Relational Database Implementation
- **Description**: Implemented a relational database for a banking enterprise with DDL and DML queries.
- **Key Features**: Created tables for customers, branches, and accounts.

### 2. Fragmentation and Replication Schemas
- **Description**: Designed and implemented fragmentation and replication schemas to ensure data availability and efficiency.
- **Key Features**: Full replication for branch tables across multiple servers.

### 3. Two-Phase Commit Protocol
- **Description**: Implemented the Two-Phase Commit protocol for distributed databases to ensure consistency across transactions.
- **Key Features**: Coordinated transactions across multiple subordinates.

### 4. Partitioning Queries on Parallel Databases
- **Description**: Executed partitioning queries to improve performance and manageability of large datasets.
- **Key Features**: Created a partitioned sales table based on date.

### 5. Parallel Joins, Sorting, and Aggregates
- **Description**: Demonstrated the implementation of parallel joins, sorting algorithms, and aggregate functions to enhance query performance.
- **Key Features**: Optimized complex queries for large datasets.

### 6. Oracle Utilities
- **Description**: Implemented various utilities for Oracle databases to manage data and improve performance.
- **Key Features**: Automated backup and restore processes.

### 7. SQL Functions in PL/SQL
- **Description**: Demonstrated the use of SQL functions within PL/SQL blocks for data manipulation.
- **Key Features**: Created reusable functions for common tasks.

### 8. Procedures in PL/SQL
- **Description**: Implemented procedures for encapsulating business logic and improving code organization.
- **Key Features**: Developed procedures for data manipulation and reporting.

### 9. Cursors in PL/SQL
- **Description**: Demonstrated the use of explicit and implicit cursors for fetching and processing data.
- **Key Features**: Handled multiple row operations efficiently.

### 10. Triggers in PL/SQL
- **Description**: Implemented triggers to enforce business rules and maintain data integrity.
- **Key Features**: Automated actions in response to DML events.

### 11. SQL Sequence and View
- **Description**: Demonstrated the use of sequences for generating unique identifiers and views for simplifying complex queries.
- **Key Features**: Created sequences for primary keys and views for reporting.

### 12. OLAP Operations and Cube Operator
- **Description**: Demonstrated OLAP operations such as ROLLUP, CUBE, and other analytical functions.
- **Key Features**: Created multidimensional analysis reports for sales data.

## Installation
To set up the project locally, follow these steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/Nikkidesigner/Advanced-database-system.git
