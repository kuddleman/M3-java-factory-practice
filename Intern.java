public class Intern extends Employee {

    public Intern(int id) {
        super(id);
    }

    @Override
    public void pay() {
        System.out.println("Interns are unpaid");
    }

    @Override
    public void timeOff() {
        System.out.println("Interns do not receive time off.");
    }

    @Override
    public void process() {
        System.out.println("Processing Intern " + super.getId());
    }

    @Override
    public void benefits() {
        System.out.println("Interns get no benefits.");
    }

}
