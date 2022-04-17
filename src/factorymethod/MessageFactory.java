package factorymethod;

public class MessageFactory {
	
	public static Message getMessage(SenderType senderType) {
		
		Message message = null;
		
		switch (senderType) {
		
		case EMAIL:
			message = new EmailMessage();
		case SMS:
			message = new SMSMessage();
		}
		
		return message;
	}
}
