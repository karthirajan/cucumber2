package org.Sample;

public class NishaBank extends ICICIBank{

	@Override
	public void deposit(int id) {
		System.out.println(id);
	}
	
	
	public void fixed() {
		System.out.println("9%");	
		}
	
	public static void main(String[] args) {
		NishaBank bank=new NishaBank();
		bank.saving();
		bank.deposit(7);
		bank.fixed();
	}
	
}
