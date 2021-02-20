import java.util.Scanner;

public class EmployeeFactory {

    public static Employee newEmployee() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the employee id: ");
        int id = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the employee name: ");
        String name = scan.nextLine();
        System.out.println("What type of employee are they? Full, part or intern ");
        String type = scan.nextLine();

        Employee employee;

        if(type.equalsIgnoreCase("FULL")) {
            employee = new FullTimeEmployee(id, name);
        } else if (type.equalsIgnoreCase("PART")) {
            System.out.println("How is the parttimer paid? Salary or hourly?");
            String payType = scan.nextLine();
            if(payType.equalsIgnoreCase("salary")) {
               employee = new PartTimeEmployee(id, name, new SalaryPayer());
            } else if(payType.equalsIgnoreCase("hourly")) {
                employee = new PartTimeEmployee(id, name, new HourlyPayer());
            } else {
                throw new IllegalArgumentException();
            }

        } else if(type.equalsIgnoreCase("intern")){
           employee = new Intern(id, name);
        } else {
            throw new IllegalArgumentException();
        }
        return null;
    }
}
