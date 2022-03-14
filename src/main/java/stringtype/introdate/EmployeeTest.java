package stringtype.introdate;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee(1974,11,21, "Anett");

        System.out.println(employee.getName());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getBeginEmployment());
        employee.setName("Kriszti");
        System.out.println(employee.getName());
    }
}
