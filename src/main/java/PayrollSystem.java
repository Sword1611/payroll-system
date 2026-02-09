import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1001, "Alex"));
        employees.add(new Employee(1002, "Toshinori"));
        employees.add(new Employee(1003, "Tsuna"));
        employees.add(new Employee(1004, "Luffy"));
        employees.add(new Employee(1005, "Sakuragi"));
        employees.add(new Employee(1006, "Rock Lee"));
        employees.add(new Employee(1007, "Might Guy"));

        Scanner scanner = new Scanner(System.in);

        int employeeId;
        String employeeName;
        double hourlySalary, weeklyTime, weeklySalary, overTime;
        double regularPay, overtimePay, netPay;

        System.out.print("Enter employee id: ");
        employeeId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter hourly salary: ");
        hourlySalary = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter weekly time: ");
        weeklyTime = Double.parseDouble(scanner.nextLine());

        payrollSystem.checkId(employeeId, employees);
    }

    public void checkId(int employeeId, List<Employee> employees) {
        for (Employee employee : employees) {
            if (employeeId == employee.getEmployeeId()) {
                System.out.print("Employee name: ");
                System.out.println(employee.getEmployeeName());
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
