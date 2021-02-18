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
        Employee e;

        if(type.equalsIgnoreCase("FULL")) {
            e = new FullTimeEmployee(id);
        } else if (type.equalsIgnoreCase("PART")) {
            e = new PartTimeEmployee(id);
        } else {
            throw new IllegalArgumentException();
        }
        addEmployee(e);
    }

    public void runPayroll() {
        for(Employee emp : employeeList) {
            emp.pay();
        }
    }
}
