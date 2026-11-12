import mypack.Student;
import mypack.Teacher;

public class AccessPackage {
    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.displayStudent();
        t.displayTeacher();

        System.out.println("Package classes accessed successfully!");
    }
}

