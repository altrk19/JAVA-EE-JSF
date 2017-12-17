package _06.conversationScope;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named // CDI bean icin @Named annotation kullan.
@ConversationScoped // ConversationScope sadece CDI icin gecerli!
public class ConversationScopedBean implements Serializable{ // Serializable etmeyi unutma!

	@Inject // DI (dependency injection) mekanizmasi
	private Conversation conversation;
	
	private Employee employee;
	
	@PostConstruct
	public void init() {
		System.out.println("initing....");
		employee = new Employee();
	}

	public Conversation getConversation() {
		return conversation;
	}

	public void setConversation(Conversation conversation) {
		this.conversation = conversation;
	}
	
	public String start(){
		conversation.begin();
		return "02.loginConversationScoped.xhtml?faces-redirect=true"; 
	}
	
	public String finish(){
		conversation.end();
		return "06.afterEndConversation.xhtml?faces-redirect=true"; 
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void callMe() {
		System.out.println("call Me invoked!!!");
	}
	
}
