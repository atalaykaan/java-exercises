package org.javaturk.oofp.ch09.domain;

public class Bride extends Person {

	public Bride(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	@Override
	public String toString() {
		return "Bride [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
