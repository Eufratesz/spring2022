package objects.intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Jim Smith", 1999, 202_000);
        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());
        System.out.println(employee);

        employee.setName("Jason Brown");
        System.out.println(employee.getName());

        employee.raiseSalary(50_000);
        System.out.println(employee.getSalary());
        System.out.println(employee.toString());
    }
}
