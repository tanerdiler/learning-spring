package my;

import org.springframework.integration.annotation.Gateway;

public interface EventGateway {
	@Gateway
	public void fire (String text);
}
