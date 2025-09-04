package org.javaturk.oofp.ch06.account.account2;

public class Deposit implements AccountAction {

	@Override
	public double act(double balance, double amount) {
		balance -= amount;
		return balance;
	}
}
