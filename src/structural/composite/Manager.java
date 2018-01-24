package structural.composite;

public class Manager implements IEmployee {

	private String name;
	private String empId;
	
	public Manager(String name, String empId) {
		this.name = name;
		this.empId = empId;
	}
	
	@Override
	public void employeeDetails() {
		System.out.println("MANAGER: [Name: "+name+", empId: "+empId+"]");
	}

}
