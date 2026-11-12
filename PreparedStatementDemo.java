
import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish database connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/StudentDB",
                "javauser",
                "Java@12345"
            );

            Scanner sc = new Scanner(System.in);

            // Take student ID from user
            System.out.print("Enter Student ID to Search: ");
            int id = sc.nextInt();

            // Parameterized SQL query
            String query = "SELECT * FROM Student WHERE id = ?";

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(query);

            // Set parameter value
            ps.setInt(1, id);

            // Execute query
            ResultSet rs = ps.executeQuery();

            // Display result
            if (rs.next()) {
                System.out.println("Student Found!");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Course: " + rs.getString("course"));
                System.out.println("Marks: " + rs.getDouble("marks"));
            } else {
                System.out.println("Student Record Not Found!");
            }

            // Close resources
            rs.close();
            ps.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
