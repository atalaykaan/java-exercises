
package org.javaturk.oofp.ch07.examples.stringAnalyzer;

@FunctionalInterface
public interface StringAnalyzer {

	public boolean analyze(String target, String searchStr);
		
}
