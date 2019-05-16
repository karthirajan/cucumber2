package com.cts.test.login;

public class CourseDetails {
	// Depends on datatype
	private void dataBase(int empId) {
		System.out.println("Emp id is:"+empId);

	}

	// Depends on datatype count and order
	private void dataBase(int empId, String name) {
		System.out.println("IS method=" + empId + "\t" + name);
	}

	private void dataBase(long mobno, String email, float salary) {
		System.out.println("LSF method:" + mobno + "\t" + email + "\t" + salary);
	}

	public static void main(String[] args) {
		CourseDetails c=new CourseDetails();
		c.dataBase(12345);
		c.dataBase(9500746453l, "Syed@gmail.com", 23.5f);
		c.dataBase(123456, "Syed");
		
	
	}

}