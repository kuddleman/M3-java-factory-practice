import java.util.Scanner;

public class DepartmentTester {

    public static void main(String[] args) {
        Department salesDepartment = new Department();

        for (int i = 0; i < 2; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the employee id:");
            int id = Integer.parseInt(scan.nextLine());
            System.out.println("What type? full, part or intern");
            String type = scan.nextLine();
        }
    }
}
