//WEB-INF İÇERİSİNE faces-config.xml dosyası yazıldı ve konfügürasyon yapıldı.

package _02.dynamicNavigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DynamicNavigationBean {
	private String name;
	private String password;

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

	private int counter = 0;
	private boolean locked = false;

	public String login() {
		if (name.equals("Ali") && password.equals("Bey")) {
			counter = 0;
			locked = false;
			return "success";
		}
		
		else if (locked) {
			return "locked";
		}
		else {
			counter++;
			return "failure";                       //config dosyasında failure -> relogin opalrak ayarlandı.
		}
	}

	public String checkCounter() {
		if (counter > 3) {
			locked = true;
			return "locked";
		} else
			return "retry";
	}
}