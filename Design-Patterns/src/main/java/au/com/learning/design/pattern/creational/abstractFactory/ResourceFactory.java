package au.com.learning.design.pattern.creational.abstractFactory;

import au.com.learning.design.pattern.creational.abstractFactory.Instance.Capacity;

public interface ResourceFactory {

	Instance createInstance(Capacity c);
	
	Storage createStorage(int capInMb);
}
