import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee();

        // Set employee attributes using setter methods
        employee.setEmployeeId(12345L);
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setDob(LocalDate.of(1990, 1, 1));
        employee.setLastFourSsn("1234");

        // Access and print employee information using getter methods
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Date of Birth: " + employee.getDob());
        System.out.println("Last 4 SSN: " + employee.getLastFourSsn());
    }
}
