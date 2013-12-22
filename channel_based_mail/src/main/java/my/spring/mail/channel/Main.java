package my.spring.mail.channel;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
		 PropertyPlaceholderConfigurer pph = new PropertyPlaceholderConfigurer();
		 pph.setLocations(new Resource[]{new ClassPathResource("META-INF/spring/email.properties")});
		 context.addBeanFactoryPostProcessor(pph);
		 context.setConfigLocation("application-context.xml");
		 context.refresh();
		 SignUpService service = (SignUpService) context.getBean(SignUpService.class);
		 service.signup("taner", "diler", "taner.diler@gmail.com");
	}
}
