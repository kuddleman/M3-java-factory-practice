import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> employeeList;

    public Department() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employeeList.add(e);
        e.process();
    }

    public void addEmployee(String type, int id) {
        Employee e = EmployeeFactory.newEmployee(type, id);
        addEmployee(e);
    }

    public void runPayroll() {
        for(Employee emp : employeeList) {
            emp.pay();
        }
    }
}
