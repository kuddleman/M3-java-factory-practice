
public class FullTimeEmployee extends Employee {
		
	public FullTimeEmployee(int id, String name) {
		super(id, name, new SalaryPayer());
	}

	@Override
	public void pay() {
		System.out.println("Paying " + super.getId() + " based on salary.");
	}
	
	@Override
	public void timeOff() {
		System.out.println(super.getId() + " has paid vacation and sick days.");
	}
	
	@Override
	public void process() {
		System.out.println(super.getId() + " has been full-time processed.");
	}
	
	@Override
	public void benefits() {
		System.out.println("Issuing benefits to " + super.getId());
	}
	
	public void bonus() {
		System.out.println(super.getId() + " is being paid a bonus.");
	}
	
	
	
}
