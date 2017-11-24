package _05.ajax;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloAjaxBean {

	private String name;
	private String password;
	public HelloAjaxBean() {
		super();
	}
	public HelloAjaxBean(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	public String getKarsilama() {
		return "welcome "+name + " " +password;
	}
}
