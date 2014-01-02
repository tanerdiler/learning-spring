package my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {
	
	@Autowired
	EventGateway eventGateway;
	
	public void signup(String firstname, String lastname, String email) {
		eventGateway.fire(firstname+" "+lastname+" : emai="+email);
	}
}
