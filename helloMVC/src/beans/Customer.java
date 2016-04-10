package beans;

public class Customer {
	
	private String id;
	private String pw;
	private String name;
	private String email;
	
	public Customer(String id, String pw, String name, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}

	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
}
