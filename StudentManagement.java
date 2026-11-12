import java.sql.*;
import java.util.Scanner;

class StudentManagement {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/StudentDB",
            "javauser", "Java@12345");

        System.out.println("Database Connected!");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Student Name: ");
        String name = sc.next();

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO Student(id, name) VALUES(?, ?)");

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();

        System.out.println("Student Added Successfully!");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Student");

        System.out.println("\nStudent Records:");

        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " " +
                rs.getString("name"));
        }

        con.close();
        sc.close();
    }
}
