package structural.composite;

public class Developer implements IEmployee{

	private String name;
	private String empId;
	private String position;
	
	public Developer(String name, String empId, String position) {
		this.name = name;
		this.empId = empId;
		this.position = position;
	}
	
	@Override
	public void employeeDetails() {
		System.out.println("DEVELOPER: [Name: "+name+", empId: "+empId+", position: "+position+"]");
	}

}
