package org.sample;

public class Str {
	public static void main(String[] args) {
		String s = "hai welcome to java class";

		String[] a = s.split("a");
		System.out.println(a[1]);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//to print all letters only by one in string
		String res="";
		for (int i = s.length()-1; i >=0 ; i--) {
	
		res=res+s.charAt(i);
		}
		System.out.println(res);
	}
}
