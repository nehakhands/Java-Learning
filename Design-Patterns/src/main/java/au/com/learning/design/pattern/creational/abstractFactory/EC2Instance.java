package au.com.learning.design.pattern.creational.abstractFactory;

public class EC2Instance implements Instance {

	public EC2Instance(Capacity c) {
		
	}

	@Override
	public void start() {
		System.out.println("EC2 started");
	}

	@Override
	public void stop() {
		System.out.println("EC2 stopped");
	}

	@Override
	public void attachStorage(Storage storage) {
		// TODO Auto-generated method stub
		
	}

}
