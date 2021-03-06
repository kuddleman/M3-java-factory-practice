
public abstract class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private Payer payer;
	
	private static int numEmployees = 0;
   public static final int DEFAULT_ID = 0;
	
	
	public Employee(int id, String name, Payer payer) {
		this.id = id;		
		Employee.numEmployees++;
	}
   

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id >= 0) {
			this.id = id;
		}
	}
	
	public static int getNumberOfEmployees() {
		return Employee.numEmployees;
	}

	@Override
	public String toString() {
		return "ID: " + id ;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee otherEmployee = (Employee) obj;
			
			int otherEmployeeId = otherEmployee.id;
			
			return id==otherEmployeeId;
			
		} else {
			return false;
		}
		
	}
	
	@Override
	public int compareTo(Employee emp) {
			return Integer.compare(id,  emp.id); 
	}
	
	public void pay() {
		payer.pay();
	}
	

	public void review() {
		System.out.println(id + " is undergoing annual review.");
	}
	public abstract void benefits();
	public abstract void timeOff();
	public abstract void process();
	
	
	
}
