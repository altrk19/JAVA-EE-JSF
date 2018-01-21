package _02.dropdown_combobox;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SelectBean {

	private String language;            //selectOneMenu hardcoded ile kullanýmý

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	private String gender;              //selectOneMenu with array (non hardcoded)
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String[] getPreparedGenders() {
		return new String[] {"male","female"};
	}
	
	//h:selectManyMenu
	private String years[];                          //seçilenleri dizinin içine atar.

	public String[] getYears() {
		return years;
	}

	public void setYears(String[] years) {
		this.years = years;
	}
	
	public String[] getPreparedYears() {
		return new String[] { "2016", "2017", "2018", "2019", "2020" };
	}
	
	//h:selectOneListbox
	private String birthYear;
	//h:selectManyListbox
	private String[] years2;
	

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String[] getYears2() {
		return years2;
	}

	public void setYears2(String[] years2) {
		this.years2 = years2;
	}

	

}
