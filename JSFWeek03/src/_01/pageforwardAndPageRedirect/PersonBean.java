package _01.pageforwardAndPageRedirect;

import javax.faces.bean.ManagedBean;
//DIKKAT! dogru paketteki @managedbean kullan!!!!

// POJO -> plain old java object -> private property/instance degiskenler , public getter setter , no-arg constructor
//bu yapidaki classlar -> pojo

// Bean -> pojonun farkli frameworkerdeki ismi;
// JSF -> managed bean
// JPA -> entity bean
// Spring -> bean

// ManagedBean  -> jsf tarafindan kullanilan/yonetilen/ulasilan beanler/pojolar.

@ManagedBean
public class PersonBean {

	private String name ="admin";
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
