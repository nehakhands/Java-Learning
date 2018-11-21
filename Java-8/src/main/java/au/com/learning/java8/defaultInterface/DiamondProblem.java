package au.com.learning.java8.defaultInterface;

public class DiamondProblem implements InterfaceA, InterfaceB {

	public static void staticMethod() {
		
	}
	@Override
	public void testA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	/* In case of a class implementing two interfaces with same default method in both 
	 * interfaces, compiler forces to add an implementation for the default method to 
	 * avoid the diamond problem. 
	 * @see au.com.learning.java8.defaultInterface.InterfaceA#testDefault()
	 */
	@Override
	public void testDefault() {
		// TODO Auto-generated method stub
		InterfaceA.super.testDefault();
	}

	@Override
	public void testB() {
		// TODO Auto-generated method stub
		
	}

}
