package au.com.learning.design.pattern.creational.factoryMethod;

public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		// TODO Auto-generated method stub
		return new JSONMessage();
	}

}
