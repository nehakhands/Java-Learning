package au.com.learning.design.pattern.creational.singleton;

/** Lazy initialization without sybcronization or double locking problems */
public class InnerClassLazyInitialization {

	private InnerClassLazyInitialization() {
		System.err.println("In InnerClassLazyInitialization constructor ");
	}
	
	private static class InnerLazy {
		private static InnerClassLazyInitialization instance = new InnerClassLazyInitialization();
	}
	
	public static InnerClassLazyInitialization getInstance() {
		return InnerLazy.instance;
	}
}
