public class EmployeeTest {

    public static void main(String[] args) {
        String[] employees = {"Reanna Gibson", "Harry Taylor", "Taran Che"};
        String[] projects = {"Sky Sports", "Sky Zero", "Sky Glass"};

        ManagerRole manager = new ManagerRole(employees);
        RegularRole regular = new RegularRole(projects);

        Employee employee = new Employee("Ayaz Baig", 22, regular);
        printOut(employee);

        employee.setRole(manager);
        printOut(employee);

    }

    private static void printOut(Employee employee) {
        String output = employee.getRole().getRoleName() + ":\n" + employee.getJobInfo();
        System.out.println(output);
    }
}
