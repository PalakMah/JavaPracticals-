
package mypack;

public class PackageAccess {
    public static void main(String[] args) {

        Student s = new Student();

        // Accessing default members
        System.out.println("Roll Number: " + s.rollNo);

        s.display();
    }
}
