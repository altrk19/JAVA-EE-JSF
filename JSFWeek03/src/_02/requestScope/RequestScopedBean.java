package _02.requestScope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class RequestScopedBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getHashCode(){
		return super.hashCode();
	}
}

// @RequestScoped olarak tanimli bir managed bean, tek bir HTTP request i boyunca yasar.
// ornek olarak redirect yaklasimi kullanirsak burada , 2 tane istek oldugu icin ilgili degerlere sonraki sayfada erisim saglanmaz!