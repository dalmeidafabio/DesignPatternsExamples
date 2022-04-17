package factorymethod;

public class TestFactoryMethod {

	public static void main(String[] args) {

		String text = "Hello!";
		
		Message message = MessageFactory.getMessage(SenderType.SMS);
		
		message.send(text);
	}
}
