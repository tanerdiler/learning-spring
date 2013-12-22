package my.spring.mail.channel;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class UserSignupMailMessageTransformer {
	
	@Autowired
	public SimpleMailMessage mailMessage;
	
	public void setMailMessage(SimpleMailMessage mailMessage) {
		this.mailMessage = mailMessage;
	}

	public MailMessage transform(UnconfirmedUser user) {
		if (user == null) {
			return null;
		}

		mailMessage
				.setTo(user.getEmail());
		mailMessage
				.setSubject("Account activation mail");
		mailMessage.setSentDate(new Date(0));
		mailMessage
				.setText("Dear "+user.fullname()+",\n"+
		"Please click here to activate your account!");

		return mailMessage;
	}
}