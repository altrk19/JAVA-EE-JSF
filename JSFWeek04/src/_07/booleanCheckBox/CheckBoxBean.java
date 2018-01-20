package _07.booleanCheckBox;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CheckBoxBean {

	private boolean enabled;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
