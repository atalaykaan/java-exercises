package org.javaturk.oopj.ch10.packaging.packageA;

public class ClassA {

//	ClassX x1; // Error!
	org.javaturk.oopj.ch10.packaging.packageX.ClassX x;
	
	public ClassA(org.javaturk.oopj.ch10.packaging.packageX.ClassX x) {
		this.x = x;
	}
}
