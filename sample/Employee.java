package org.sample;

public class Employee {

	public void empId(String name) {
		System.out.println("String method "+name);
	}
	//no of arguments
	public void empId(long phno,String email,char block) {
		System.out.println("3 method "+phno);
		System.out.println(email +"\n"+block);
	}
	//datatypes
	public void empId(int regno) {
		System.out.println("int  method "+regno);
	}
	public void empId(char regno) {
		System.out.println("int  method "+regno);
	}
	//order
	public void empId(String manager,String project) {
		System.out.println("String String method "+manager+"\n"+project);
	}
	
	public void empId(float sal,String name) {
		System.out.println("float String method "+sal+"\n"+name);
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empId("nisha");
		emp.empId(1234567.456f, "vel");
		emp.empId(123456785678l, "nisha@gmail.com", 'A');
	}
}
