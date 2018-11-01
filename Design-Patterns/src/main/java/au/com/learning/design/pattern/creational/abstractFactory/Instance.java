package au.com.learning.design.pattern.creational.abstractFactory;

public interface Instance {
	enum  Capacity{micro, small, large};
	void start();
	void attachStorage(Storage storage);
	void stop();
	
}
