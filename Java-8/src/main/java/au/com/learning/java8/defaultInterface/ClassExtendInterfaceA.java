package au.com.learning.java8.defaultInterface;

public class ClassExtendInterfaceA implements ExtendInterfaceA {

	@Override
	public void testA() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		ExtendInterfaceA a = new ClassExtendInterfaceA();
		//ExtendInterfaceA.testDefault();
		a.testDefault();
		a.testStatic();
		InterfaceA.testStatic();
	}

}
