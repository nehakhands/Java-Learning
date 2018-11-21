package au.com.learning.java8.defaultInterface;

public interface InterfaceB {

	void testB();
	
	void test();
	
	default void testDefault() {
		System.out.println("In InterfaceB testDefault");
	}
	
	static void testStatic() {
		System.out.println("In InterfaceB testStatic");
	}
}
