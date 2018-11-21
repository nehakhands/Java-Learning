package au.com.learning.java8.defaultInterface;

public interface ExtendInterfaceA extends InterfaceA {

	/*
	 * we can have default method with same name and signature in the derived Interface
	 * as the static method in base Interface but we cant have default method as static method
	 * in the derived interface as the static methods hides the implementation of instance method. 
	 * Below commented code will throw compilation error. */
	/**static void testDefault() {
		System.out.println("In InterfaceA testDefault");
	}*/
	
	default void testStatic() { 
		System.out.println("In InterfaceA testStatic");
	}
}
