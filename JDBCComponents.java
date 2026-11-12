
import java.sql.*;

public class JDBCComponents {
    public static void main(String[] args) {

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 1. Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/StudentDB",
                "javauser",
                "Java@12345"
            );

            System.out.println("Database Connected!");

            // 2. Statement
            Statement st = con.createStatement();

            String query = "SELECT * FROM Student";

            // 3. ResultSet
            ResultSet rs = st.executeQuery(query);

            System.out.println("\nStudent Records:");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Course: " + rs.getString("course"));
                System.out.println("Marks: " + rs.getDouble("marks"));
                System.out.println("----------------------");
            }

            // 4. PreparedStatement
            String insertQuery =
                "INSERT INTO Student VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps =
                con.prepareStatement(insertQuery);

            ps.setInt(1, 102);
            ps.setString(2, "Rahul");
            ps.setInt(3, 21);
            ps.setString(4, "CSE");
            ps.setDouble(5, 90.5);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Record Inserted Successfully!");
            }

            // Close resources
            rs.close();
            st.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
