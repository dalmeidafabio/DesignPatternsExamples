package factorymethod;

public class EmailMessage implements Message {

	@Override
	public void send(String message) {
		System.out.println("E-mail: " + message);		
	}

}
