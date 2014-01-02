import my.SignUpService;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	private static final Logger LOGGER = Logger.getLogger(Main.class);

    private Main() { }

    /**
     * Load the Spring Integration Application Context
     *
     * @param args - command line arguments
     * @throws InterruptedException 
     */
    public static void main(final String... args) throws InterruptedException {
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
    	context.registerShutdownHook();
    	SignUpService service = (SignUpService) context.getBean(SignUpService.class);
    	int count = 0;
		 	while (true) {
		 		service.signup((count++)+" taner", "diler", "taner.diler@gmail.com");
		 		Thread.currentThread().sleep(1000);
		 	}

    }
}
