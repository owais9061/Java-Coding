package experiment07;
import java.util.Date;

public class TestProgram {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St", "123-456-7890", "john.doe@example.com");
        Student student = new Student("Jane Smith", "456 Elm St", "987-654-3210", "jane.smith@example.com");
        Employee employee = new Employee("John Smith", "789 Oak St", "555-555-5555", "john.smith@example.com",
                "A101", 50000, new Date());
        Faculty faculty = new Faculty("Mary Johnson", "321 Pine St", "111-222-3333", "mary.johnson@example.com",
                "B202", 80000, new Date(), "9 AM - 12 PM", "Professor");
        Staff staff = new Staff("Robert Williams", "789 Oak St", "555-555-5555", "robert.williams@example.com",
                "C303", 40000, new Date(), "Clerk");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
