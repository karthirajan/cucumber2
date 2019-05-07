package org.cts.test.login;

public class Company extends Employee{

	public void comId() {
		System.out.println("com id is 456789");
	}
	
	
	public void comName() {
		System.out.println("com name is cts");
	}
	
	public static void main(String[] args) {
		Company c=new Company();//100
		c.comId();
		c.comName();
		c.empId();
		c.empName();
		
		
		
	}
}
