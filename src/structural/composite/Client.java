package structural.composite;

public class Client {

	public static void main(String[] args) {
		Developer dev1 = new Developer("Gagandeep Singh Saini", "E00205", "SE");
		Developer dev2 = new Developer("Sachin", "E00190", "SSE");
		
		Manager m1 = new Manager("Preeti Khanna", "E00404");
		Manager m2 = new Manager("Amit Kapoor", "E00302");
		
		CompanyDirector cd1 = new CompanyDirector();
		cd1.addEmployee(dev1);
		cd1.addEmployee(dev2);
		
		CompanyDirector md1 = new CompanyDirector();
		md1.addEmployee(m1);
		md1.addEmployee(m2);
		
		CompanyDirector mainDirector = new CompanyDirector();
		mainDirector.addEmployee(cd1);
		mainDirector.addEmployee(md1);
		
		mainDirector.employeeDetails();
	}
}

