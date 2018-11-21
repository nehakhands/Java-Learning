package au.com.learning.java8.defaultInterface;

public interface InterfaceA {

	void testA();
	
	void test();
	
	default void testDefault() {
		System.out.println("In InterfaceA testDefault");
	}
	
	static void testStatic() { 
		System.out.println("In InterfaceA testStatic");
	}
}
