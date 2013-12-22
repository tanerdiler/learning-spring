package my.spring.mail.channel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpService {
	@Autowired
	MailGateway mailGateway;
	
	public void signup(String firstname, String lastname, String email) {
		UnconfirmedUser user = new UnconfirmedUser(firstname, lastname, email);
		mailGateway.sendMail(user);
	}

}
