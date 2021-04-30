package com;

public class EmployeeService {

	public float calSalary(int id, String name, float salary, String designation) {
		
		if(designation.equals("Manager")) {
			return salary + 3000;
		}
		
		else if(designation.equals("DevOps")) {
			return salary + 50000;
		}
		
		else {
			return salary + 1000;
		}
		
	}
	
	public String sayHello(String name) {
		return "Welcome " + name;
	}
	
}
