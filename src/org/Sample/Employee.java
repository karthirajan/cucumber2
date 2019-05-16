package org.Sample;

public class Employee {

	public void empId(String name) {
		System.out.println("String method "+name);
	}
	//count of arguments
	public void empId(long phno,String email,char block) {
		System.out.println("3 method "+phno);
		System.out.println(email+"\n"+block);
	}
	//datatype
	public void empId(int regno) {
		System.out.println("int method "+regno);
	}
	public void empId(boolean perEmp) {
		System.out.println("String method "+perEmp);
	}
	//order
	public void empId(String manager,String project) {
		System.out.println("String String method "+manager+"\n"+project);
	}
	
	public void empId(float sal,String date) {
		System.out.println("float String method "+sal+"\n"+date);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId("nisha");
		e.empId(123456.456f, "12/7/90");
		e.empId(1234567890l, "nisha@gmail.com", 'A');
	}
}
