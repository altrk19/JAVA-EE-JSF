package _01.hello_jsf;

import javax.faces.bean.ManagedBean;

//POJO  -> plain old java object : private instance degiskenler,public getter setter,constructor
//Bean -> POJO oluyor. POJO'nun farklý framework'lerdeki ismidir.
//JSF ->managed bean    adýný verir bean'lere
//JPA -> entity bean    adýný verir bean'lere
//Spring -> bean        adýný verir bean'lere

//ManagedBean : jsf tarafýndan yönetilen beanler/pojolar.


//dikkat! doðru paketteki @managedbean kullan!
@ManagedBean
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
	

}
