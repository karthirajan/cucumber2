package org.sample;

public class GreensBank extends ICICIBank{
@Override
public void deposit(int id) {
	System.out.println("5%"+id);
}

public void fixed() {
	System.out.println("8%");
}

public static void main(String[] args) {
	GreensBank  bank=new GreensBank();
	bank.saving();
	bank.deposit(12);
	bank.fixed();
}
}
