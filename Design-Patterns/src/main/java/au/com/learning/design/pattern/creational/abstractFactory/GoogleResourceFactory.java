package au.com.learning.design.pattern.creational.abstractFactory;

import au.com.learning.design.pattern.creational.abstractFactory.Instance.Capacity;

public class GoogleResourceFactory implements ResourceFactory{

	@Override
	public Instance createInstance(Capacity c) {
		// TODO Auto-generated method stub
		return new GoogleComputeEngineInstance(c);
	}

	@Override
	public Storage createStorage(int capInMb) {
		// TODO Auto-generated method stub
		return new GoogleStorage(capInMb);
	}

}
