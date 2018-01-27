package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirector implements IEmployee {

	List<IEmployee> employeeList = new ArrayList<>();
	
	@Override
	public void employeeDetails() {
		for(IEmployee emp: employeeList) {
			emp.employeeDetails();
		}
	}
	
	public void removeEmployee(IEmployee emp) {
		employeeList.remove(emp);
	}
	
	public void addEmployee(IEmployee emp) {
		employeeList.add(emp);
	}

	
}
