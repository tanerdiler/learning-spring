package my.spring.mail.channel;

public class UnconfirmedUser {
	
	private String firstname;
	private String lastname;
	private String email;
	
	public UnconfirmedUser (String firstname, String lastname, String email)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstname () {
		return firstname;
	}
	
	public String getLastname () {
		return lastname;
	}
	
	public String fullname () {
		return firstname + " " + lastname;
	}
}
