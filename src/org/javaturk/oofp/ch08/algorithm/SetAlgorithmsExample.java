
package org.javaturk.oofp.ch08.algorithm;

import java.util.Collections;
import java.util.Set;

import org.javaturk.oofp.ch08.util.CollectionUtil;

/**
 * @author akin
 *
 */
public class SetAlgorithmsExample {

	/**
	 * @author akin
	
	 * @param args
	 */
	public static void main(String[] args) {
		singleton();
	}
	
	private static void singleton() {
		System.out.println("Singleton and immutable set.");
		Set singletonImmutableSet = Collections.singleton("Java");
		CollectionUtil.listElements(singletonImmutableSet);
		singletonImmutableSet.add("C++");
	}

}
