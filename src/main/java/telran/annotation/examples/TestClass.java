package telran.annotation.examples;

import telran.test.annotation.BeforeEach;
import telran.test.annotation.Test;

public class TestClass {
	@BeforeEach
	void testBefore() {
		System.out.println("exec 1 before test");
	}
	private void f1(int b) {
		System.out.println("test f1 passed " + b);
	}
	private void f1() {
		System.out.println("test f1 failed ");
	}
	@BeforeEach
	void testBefore2() {
		System.out.println("exec 2 before test");
	}
	@Test
	void test1() {
		f1(10);
	}
	@Test 
	void test2() {
		f1();
	}
}
