public class EmployeeFactory {

    public static Employee newEmployee(String type, int id) {
        Employee e;
        if(type.equalsIgnoreCase("FULL")) {
            e = new FullTimeEmployee(id);
        } else if (type.equalsIgnoreCase("PART")) {
            e = new PartTimeEmployee(id);
        } else {
            throw new IllegalArgumentException();
        }
        return e;
    }
}
