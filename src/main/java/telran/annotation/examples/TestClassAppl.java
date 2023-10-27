package telran.annotation.examples;

import telran.test.TestRunner;

public class TestClassAppl {

	public static void main(String[] args) {
		TestClass testObj = new TestClass();
		TestRunner testRunner = new TestRunner(testObj);
		testRunner.run();
	}

}
