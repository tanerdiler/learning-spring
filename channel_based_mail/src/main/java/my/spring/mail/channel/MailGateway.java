package my.spring.mail.channel;

import org.springframework.integration.annotation.Gateway;

public interface MailGateway
{
		   @Gateway
		   public void sendMail(UnconfirmedUser user);
}
