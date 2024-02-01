import com.java.pratice.static_examples.Student;

public class College {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Abc");
        s1.setDepartment("CSE");

        Student s2 = new Student();
        s2.setId(102);
        s2.setName("Xyz");
        s2.setDepartment("ECE");

        s1.display();
        s2.display();
    }
}
