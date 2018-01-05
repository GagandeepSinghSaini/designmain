package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirector implements Employee {

	List<Employee> 	employeeList = new ArrayList<Employee>();
	
	@Override
	public void employeeDetails() {
		for(Employee emp: employeeList) {
			emp.employeeDetails();
		}
	}
	
	public void removeEmployee(Employee emp) {
		employeeList.remove(emp);
	}
	
	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}

	
}
