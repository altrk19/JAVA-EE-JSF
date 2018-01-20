package _04.outputBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class OutputBean {
	private String message="test message";
	private String messageHTML="<input size='20' type='text' />";           //veriyi JSTL'deki c:out gibi kontrollü þekilde yazar. XSS taklarýna karþý önlem
	
	public String getMessage() {
		return message;
	}

	
	public void setMessage(String message) {
		this.message = message;
	}

	
	public String getMessageHTML() {
		return messageHTML;
	}


	public void setMessageHTML(String messageHTML) {
		this.messageHTML = messageHTML;
	}
	
	

}
