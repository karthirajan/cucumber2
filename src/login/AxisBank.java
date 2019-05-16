package com.cts.test.login;

public class AxisBank extends HDFC {
	public void fixedAccount() {
		System.out.println("6%");
	}

	@Override
	public void deposit(String intrest) {
		System.out.println("Interest is:"+intrest);
	}
	@Override
	public void savingsAccount() {
		System.out.println("7%");
	}

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit("10%");
		a.savingsAccount();
		a.fixedAccount();
	}

}
