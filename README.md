# ☕ Java Programming Laboratory

**Repository:** Java Programming Laboratory – Practical Experiments

This repository contains Java programs implemented as part of the **Java Programming Laboratory** coursework. It covers fundamental programming concepts, Object-Oriented Programming (OOP), exception handling, multithreading, GUI development, file handling, and database connectivity using JDBC.

## 📌 Table of Contents

- [Objectives](#-objectives)
- [Programs in This Repository](#-programs-in-this-repository)
- [List of Experiments](#-list-of-experiments)
- [Technologies Used](#️-technologies-used)
- [Installation and Setup](#️-installation-and-setup)
- [Repository Structure](#-repository-structure)
- [Learning Outcomes](#-learning-outcomes)
- [Author](#-author)

---

## 🎯 Objectives

- Understand Java programming fundamentals and syntax.
- Develop problem-solving skills using arrays, strings and control structures.
- Apply Object-Oriented Programming principles.
- Understand inheritance, polymorphism, abstraction and encapsulation.
- Implement exception handling and multithreading.
- Develop GUI applications using Java AWT.
- Perform file operations and object serialization.
- Connect Java applications with MySQL databases using JDBC.

---

## 💻 Programs in This Repository

| File / Folder | Description | Experiment |
|---|---|---|
| `mypack/` | User-defined package containing related classes | 5 – Packages and Interfaces |
| `AccessPackage.java` | Imports and accesses classes from `mypack` | 5 – Packages and Interfaces |
| `Bank.java` | Bank system program | 3 / 6 |
| `DatabaseConnection.java` | Establishes the JDBC connection to MySQL | 10 – JDBC |
| `StudentManagement.java` | Student Database Management System (CRUD menu) | 10 – JDBC |
| `DisplayStudent.java` | Retrieves and displays student records using `ResultSet` | 10 – JDBC |
| `UpdateStudent.java` | Updates student records | 10 – JDBC |
| `PreparedStatementDemo.java` | Parameterized queries using `PreparedStatement` | 10 – JDBC |
| `JDBCComponents.java` | Demonstrates `Connection`, `Statement`, `ResultSet` and `PreparedStatement` | 10 – JDBC |

> More programs will be added as the remaining experiments are completed.

---

## 🧪 List of Experiments

### Experiment 1: Java Fundamentals, Operators and Decision Making

**Aim:** To develop Java programs using data types, variables, operators, type conversion, expressions, console input/output and control statements.

**Tasks Covered:**
- Read different types of data using Scanner.
- Demonstrate arithmetic, relational, logical and bitwise operators.
- Demonstrate implicit type conversion and explicit type casting.
- Develop a menu-driven calculator using switch.
- Determine student grades using if-else-if.
- Generate multiplication tables and calculate factorials using loops.

**Concepts:** Data Types, Variables, Operators, Type Conversion, Type Casting, Scanner, Conditional Statements, Switch, For Loop and While Loop.

### Experiment 2: Arrays and String Manipulation

**Aim:** To implement programs using one-dimensional arrays, two-dimensional arrays and the String class.

**Tasks Covered:**
- Calculate maximum, minimum and average marks using arrays.
- Sort and search array elements.
- Perform addition and multiplication of matrices.
- Perform String operations such as length, substring, comparison, case conversion, searching and replacement.
- Check whether a string is a palindrome.

**Concepts:** 1-D Arrays, 2-D Arrays, Matrix Operations, String Class and String Methods.

### Experiment 3: Classes, Objects, Constructors and Method Overloading

**Aim:** To implement fundamental Object-Oriented Programming concepts using classes and objects.

**Tasks Covered:**
- Develop a Student Management Program or Bank Account System.
- Define classes with instance variables and methods.
- Create multiple objects and demonstrate object references.
- Implement default and parameterized constructors.
- Demonstrate constructor and method overloading.
- Use the `this` keyword.
- Demonstrate static variables and static methods.
- Implement public, private and protected access specifiers.

**Concepts:** Classes, Objects, References, Methods, Constructors, this, static, Access Specifiers and Overloading.

### Experiment 4: Inheritance, Polymorphism and Abstract Classes

**Aim:** To implement inheritance and runtime polymorphism in Java.

**Tasks Covered:**
- Develop an Employee Payroll System.
- Implement single and multilevel inheritance.
- Demonstrate constructor execution in inheritance.
- Use the `super` keyword.
- Override methods in derived classes.
- Demonstrate runtime polymorphism using superclass references.
- Demonstrate the `final` keyword.
- Create an abstract Employee class with an abstract method such as calculateSalary().

**Concepts:** Inheritance, Constructor Chaining, super, Method Overriding, Runtime Polymorphism, final, Abstract Classes and Abstract Methods.

### Experiment 5: Packages and Interfaces

**Aim:** To develop modular Java programs using user-defined packages and interfaces.

**Tasks Covered:**
- Create user-defined packages.
- Import and access package classes.
- Demonstrate package-level member accessibility.
- Define and implement interfaces.
- Define variables and methods in interfaces.
- Implement multiple interfaces in a class.
- Demonstrate nested interfaces.
- Demonstrate private interface methods where appropriate.

**Concepts:** Packages, package, import, CLASSPATH, Interfaces, Multiple Inheritance Through Interfaces, Nested Interfaces and Private Interface Methods.

**Files:** `mypack/`, `AccessPackage.java`

**How to compile and run:**

Programs that use packages are compiled and run differently from single-file programs. From the repository root:

```bash
# Compile the package classes
javac mypack/*.java

# Compile the program that imports the package
javac AccessPackage.java

# Run it
java AccessPackage
```

### Experiment 6: Exception Handling and User-Defined Exceptions

**Aim:** To implement robust Java programs using exception-handling mechanisms.

**Tasks Covered:**
- Develop a Bank Transaction or Student Registration System.
- Handle built-in exceptions using try-catch.
- Implement multiple catch blocks and nested try statements.
- Demonstrate the finally block.
- Use throw and throws.
- Create user-defined exceptions.
- Demonstrate exception propagation and chained exceptions.

**Concepts:** Exception Hierarchy, Checked and Unchecked Exceptions, try, catch, finally, throw, throws, User-Defined Exceptions and Exception Chaining.

### Experiment 7: Multithreading and Thread Synchronization

**Aim:** To implement concurrent programs using Java threads.

**Tasks Covered:**
- Create threads by extending the Thread class.
- Create threads by implementing the Runnable interface.
- Execute multiple threads concurrently.
- Demonstrate sleep() and join().
- Set and examine thread priorities.
- Implement thread synchronization using shared resources.
- Develop a Producer-Consumer or shared-counter program.

**Concepts:** Multitasking, Multithreading, Thread Lifecycle, Thread, Runnable, sleep(), join(), Thread Priorities and Synchronization.

### Experiment 8: AWT GUI and Event Handling

**Aim:** To design graphical Java applications using AWT components, layouts and event handling.

**Tasks Covered:**
- Develop an AWT-based Calculator or Student Registration Form.
- Create Frames and add GUI components such as Label, TextField, Button, Checkbox and Choice.
- Apply suitable layout managers.
- Handle button events using ActionListener.
- Demonstrate ItemListener, KeyListener and MouseListener.
- Use Adapter classes or inner classes for event handling.

**Concepts:** AWT Components, Containers, Layout Managers, Delegation Event Model, Event Classes, Event Sources, Listeners, Adapters and Inner Classes.

### Experiment 9: File Handling, Streams and Object Serialization

**Aim:** To perform file input/output operations and object serialization in Java.

**Tasks Covered:**
- Create and examine files using the File class.
- Read and write data using byte streams.
- Read and write text using character streams.
- Copy contents from one file to another.
- Store student or employee information in files.
- Create serializable Java classes.
- Serialize and deserialize objects using ObjectOutputStream and ObjectInputStream.

**Concepts:** java.io, File Class, Byte Streams, Character Streams, File Reading, File Writing, Serialization and Deserialization.

### Experiment 10: Database Programming Using JDBC

**Aim:** To develop a Java application that connects to a relational database and performs database operations using JDBC.

**Tasks Covered:**
- Develop a Student Database Management System.
- Create a MySQL database and Student table.
- Establish database connections using JDBC.
- Insert, display, update, delete and search student records.
- Retrieve records using ResultSet.
- Use PreparedStatement for parameterized queries.
- Demonstrate Connection, Statement, ResultSet and PreparedStatement.

**Concepts:** JDBC Architecture, JDBC Drivers, Connection, Statement, PreparedStatement, ResultSet and CRUD Operations.

**Database:** MySQL

**Files:** `DatabaseConnection.java`, `StudentManagement.java`, `DisplayStudent.java`, `UpdateStudent.java`, `PreparedStatementDemo.java`, `JDBCComponents.java`

**Sample database setup:**

```sql
CREATE DATABASE IF NOT EXISTS StudentDB;
USE StudentDB;

CREATE TABLE IF NOT EXISTS Student (
    roll_no INT PRIMARY KEY,
    name    VARCHAR(50) NOT NULL,
    branch  VARCHAR(30),
    marks   DOUBLE
);
```

> Adjust the column names and types to match the table used in the code.

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Programming Language |
| JDK | Compilation and Execution |
| VS Code | Development Environment |
| MySQL | Relational Database |
| JDBC | Java Database Connectivity |
| MySQL Connector/J | JDBC Driver |
| Git & GitHub | Version Control and Code Hosting |

---

## ⚙️ Installation and Setup

### 1. Install Java

Download and install the Java Development Kit (JDK).

Verify installation:

```bash
java -version
javac -version
```

### 2. Clone the Repository

```bash
git clone https://github.com/PalakMah/JavaPracticals-.git
```

Navigate to the project directory:

```bash
cd JavaPracticals-
```

### 3. Compile and Run Java Programs

All programs are in the repository root. Compile a file:

```bash
javac ProgramName.java
```

Run the program:

```bash
java ProgramName
```

For the package program (Experiment 5), see the [compile and run steps](#experiment-5-packages-and-interfaces) in that section.

### 4. JDBC Setup (Experiment 10)

1. Install MySQL Server.
2. Create the `StudentDB` database and `Student` table (see the [SQL snippet](#experiment-10-database-programming-using-jdbc) above).
3. Download **MySQL Connector/J** from the official MySQL website.
4. Create a `lib/` folder in the project directory and place the Connector/J JAR file inside it (the JAR is not included in this repository).
5. Add the JAR to the Java classpath when compiling and running.

**Windows (PowerShell):**

```powershell
javac -cp ".;lib\mysql-connector-j.jar" StudentManagement.java
java  -cp ".;lib\mysql-connector-j.jar" StudentManagement
```

**Linux / macOS:**

```bash
javac -cp ".:lib/mysql-connector-j.jar" StudentManagement.java
java  -cp ".:lib/mysql-connector-j.jar" StudentManagement
```

> 💡 The JAR file name usually includes a version number (for example `mysql-connector-j-9.x.x.jar`). Use the exact file name you downloaded.
>
> On Windows the classpath separator is `;`, while on Linux and macOS it is `:`.

**Note:** Configure your own MySQL username and password locally in `DatabaseConnection.java`. Never upload database credentials to GitHub.

---

## 📂 Repository Structure

```text
JavaPracticals-/
│
├── mypack/                      # User-defined package (Experiment 5)
├── .gitignore
├── AccessPackage.java           # Uses mypack (Experiment 5)
├── Bank.java                    # Bank system program
├── DatabaseConnection.java      # JDBC connection (Experiment 10)
├── DisplayStudent.java          # Display records (Experiment 10)
├── JDBCComponents.java          # JDBC components demo (Experiment 10)
├── PreparedStatementDemo.java   # PreparedStatement demo (Experiment 10)
├── StudentManagement.java       # Student DBMS with CRUD (Experiment 10)
├── UpdateStudent.java           # Update records (Experiment 10)
└── README.md
```

---

## 📚 Learning Outcomes

By completing these experiments, the following skills are developed:

- Strong understanding of Java programming fundamentals.
- Practical implementation of Object-Oriented Programming.
- Ability to develop modular and reusable Java applications.
- Understanding of exception handling and concurrent programming.
- Experience in developing GUI-based applications.
- Knowledge of file management and object serialization.
- Ability to connect Java applications with relational databases using JDBC.

---

## 👩‍💻 Author

**Palak Mahajan**

Java Programming Laboratory

GitHub: [PalakMah](https://github.com/PalakMah)

---

*This repository is maintained for academic learning, practical implementation and reference.*
