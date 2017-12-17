package _05.viewScope;

//Ajax kulland�g�m�zda request scope i�e yaram�yor.
//requestScope ile yap�lsayd� counter:1 olurdu s�rekli ve hashCode s�rekli de�i�irdi.

//viewScope'da farkl� sayfaya ge�i� oldugunda oradan ge�i� sa�lanamaz.

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
//@RequestScoped
public class ViewScopedBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	private int counter;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCounter() {
		return ++counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getGreeting() {		
		if (name != null && name.length() > 0) {
			return "Hosgeldin , " + name + "!";
		} else {
			return "";
		}
	}

	public int getHashCode() {
		return super.hashCode();
	}
}
