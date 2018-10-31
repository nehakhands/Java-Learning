package au.com.learning.design.pattern.creational.factoryMethod;

public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		// TODO Auto-generated method stub
		return new TextMessage();
	}

}
