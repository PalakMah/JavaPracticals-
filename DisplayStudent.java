import java.sql.*;

public class DisplayStudent {
    public static void main(String[] args) {

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish database connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/StudentDB",
                "javauser",
                "YOUR_PASSWORD"
            );

            // Create SQL query
            String query = "SELECT * FROM Student";

            // Create Statement
            Statement st = con.createStatement();

            // Execute query and store result
            ResultSet rs = st.executeQuery(query);

            System.out.println("Student Records:");
            System.out.println("-----------------------------");

            // Retrieve records using ResultSet
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String course = rs.getString("course");
                double marks = rs.getDouble("marks");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Course: " + course);
                System.out.println("Marks: " + marks);

                System.out.println("-----------------------------");
            }

            // Close resources
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
