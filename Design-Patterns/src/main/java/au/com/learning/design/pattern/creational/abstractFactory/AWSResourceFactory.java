package au.com.learning.design.pattern.creational.abstractFactory;

import au.com.learning.design.pattern.creational.abstractFactory.Instance.Capacity;

public class AWSResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity c) {
		// TODO Auto-generated method stub
		return new EC2Instance(c);
	}

	@Override
	public Storage createStorage(int capInMb) {
		// TODO Auto-generated method stub
		return new S3Storage(capInMb);
	}

}
