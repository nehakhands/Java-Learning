package au.com.learning.design.pattern.creational.singleton;

public class Client {

	public static void main(String[] args) {
		EagerInitialization instance = EagerInitialization.getInstance();
		EagerInitialization instance1 = EagerInitialization.getInstance();
		
		System.out.println(instance == instance1);

		LazyInitialization lazy1 = LazyInitialization.getInstance();
		LazyInitialization lazy2 = LazyInitialization.getInstance();

		System.out.println(lazy1 == lazy2);
		
		
		InnerClassLazyInitialization instance3 = InnerClassLazyInitialization.getInstance();
		InnerClassLazyInitialization instance4 = InnerClassLazyInitialization.getInstance();
		
		System.out.println(instance3 == instance4);

	}

}
