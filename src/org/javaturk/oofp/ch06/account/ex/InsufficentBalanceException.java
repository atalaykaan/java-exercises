package org.javaturk.oofp.ch06.account.ex;

public class InsufficentBalanceException extends Exception {

	public InsufficentBalanceException(String action, double balance, double amount) {
	}

	public InsufficentBalanceException(double balance, double amount) {
	}

}
