package au.com.learning.design.pattern.creational.abstractFactory;

import au.com.learning.design.pattern.creational.abstractFactory.Instance.Capacity;

public class Client {

	private ResourceFactory factory;
	
	public Client(ResourceFactory factory) {
		super();
		this.factory = factory;
	}
	
	public Instance createServer(Instance.Capacity cap, int capInMb) {
		Instance instance = factory.createInstance(cap);
		Storage s = factory.createStorage(capInMb);
		instance.attachStorage(s);
		return instance;
	}
	public static void main(String[] args) {
		Client c = new Client(new GoogleResourceFactory());
		Instance i1 = c.createServer(Capacity.large, 100);
		i1.start();
		i1.stop();
	}

}
