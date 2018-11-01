package au.com.learning.design.pattern.creational.abstractFactory;

public class GoogleComputeEngineInstance implements Instance {

	public GoogleComputeEngineInstance(Capacity c) {
		
	}
	
	@Override
	public void start() {
		System.out.println("Google Computing Engine started");
	}

	@Override
	public void stop() {
		System.out.println("Google Computing Engine stoped");
	}

	@Override
	public void attachStorage(Storage storage) {
		// TODO Auto-generated method stub
	}

}
