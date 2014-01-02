package my;

import org.springframework.integration.Message;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class MyReceiver {
	@ServiceActivator
	public void receive (Message<String> message) {
		System.out.println("MyReceiver :: "+message.getPayload());
	}
}
