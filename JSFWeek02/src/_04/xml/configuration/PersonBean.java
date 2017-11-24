package _04.xml.configuration;

public class PersonBean {

	private String name;
	private String password;

	public PersonBean() {
		super();
	}

	public PersonBean(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		System.out.println("getName!");
		return name;
	}

	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {		
		this.password = password;
	}

}
