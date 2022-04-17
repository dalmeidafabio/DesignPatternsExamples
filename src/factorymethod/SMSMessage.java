package factorymethod;

public class SMSMessage implements Message {

	@Override
	public void send(String message) {
		System.out.println("SMS: " + message);
	}

}
