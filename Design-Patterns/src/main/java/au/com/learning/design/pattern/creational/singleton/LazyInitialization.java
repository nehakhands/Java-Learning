package au.com.learning.design.pattern.creational.singleton;

public class LazyInitialization {

	private LazyInitialization() {}
	
	/** The real problem is that Thread A may assign a memory space for instance before it is finished constructing instance.
	 *  Thread B will see that assignment and try to use it. This results in Thread B failing because it is using a partially
	 *  constructed version of instance. This is fixed by making it volatile as volatile variable are always visible to other threads.
	 */
	private static volatile LazyInitialization instance;
	
	public static LazyInitialization getInstance () {
		if (instance == null) {
			synchronized (LazyInitialization.class) {
				if (instance == null) { // double check locking
					instance = new LazyInitialization();
				}
			}
		}
		return instance;
	}
}
