package my;
import org.springframework.integration.Message;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;


@Component
public class MessageService {
	
	@ServiceActivator
	public void receive (Message<String> message) {
		System.out.println("MessageService::receive = " +message.getPayload());
	}
}
