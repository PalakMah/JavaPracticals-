import java.sql.*;
import java.util.Scanner;

public class UpdateStudent {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/StudentDB",
                "javauser",
                "Java@12345"
            );

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student ID to Update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Course: ");
            String course = sc.nextLine();

            System.out.print("Enter New Marks: ");
            double marks = sc.nextDouble();

            String query = "UPDATE Student SET name=?, age=?, course=?, marks=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, course);
            ps.setDouble(4, marks);
            ps.setInt(5, id);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Student Record Updated Successfully!");
            } else {
                System.out.println("Student ID Not Found!");
            }

            ps.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


