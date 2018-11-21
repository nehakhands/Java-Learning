package au.com.learning.java8.defaultInterface;

public class Client {

	public static void main(String[] args) {
		InterfaceA a = new DiamondProblem();
		a.test();
		a.testA();
		//THIS WILL CALL THE METHOD DEFINED IN THE IMPLEMENTING CLASS
		a.testDefault();

		/***** STATIC ACCESS ******/
		InterfaceA.testStatic();
		//a.testStatic(); //COMPILATION ERROR
		DiamondProblem d = new DiamondProblem();
		d.staticMethod();
		DiamondProblem.staticMethod();
	}

}
