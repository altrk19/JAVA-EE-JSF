package _05.viewScope;

//Ajax kullandıgımızda request scope işe yaramıyor.
//requestScope ile yapılsaydı counter:1 olurdu sürekli ve hashCode sürekli değişirdi.

//viewScope'da farklı sayfaya geçiş oldugunda oradan geçiş sağlanamaz.

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
