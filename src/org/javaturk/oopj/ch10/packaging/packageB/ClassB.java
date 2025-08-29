package org.javaturk.oopj.ch10.packaging.packageB;

//import org.*; Only imports the classes under the package "org"

import org.javaturk.oopj.ch10.packaging.packageX.ClassX;
import org.javaturk.oopj.ch10.packaging.packageX.ClassZ;

// or

import org.javaturk.oopj.ch10.packaging.packageX.*;


public class ClassB {
	ClassX x;
	ClassZ z;
	
	public ClassB(ClassX x) {
		this.x = x;
	}

	public ClassB(ClassX x, ClassZ z) {
		super();
		this.x = x;
		this.z = z;
	}
}

class ClassC {
	ClassX x;
	ClassZ z;
}

class ClassD {
	ClassX x;
	ClassZ z;
}
