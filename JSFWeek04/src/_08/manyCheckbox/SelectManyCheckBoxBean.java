package _08.manyCheckbox;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SelectManyCheckBoxBean {

	private String[] languages;                       //hardcoded olarak iþlem yapýldý. Yani checkboxlar'ýn deðerleri xhtml de tanýmlandý.

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
	
	
	
	private String[] jpaFrameworks;					//array yapýsý bind edilerek iþlem yapýldý.

	public String[] getJpaFrameworks() {
		return jpaFrameworks;
	}

	public void setJpaFrameworks(String[] jpaFrameworks) {
		this.jpaFrameworks = jpaFrameworks;
	}
	
	//
	public String[] getPreparedData(){
		//veritabanindan geldigini varsayalim..
		return new String[] { "Hibernate", "OpenJPA", "EclipseLink" };
	}
	
	
	
	
	private String[] mvcFrameworks;

	public String[] getMvcFrameworks() {
		return mvcFrameworks;
	}
	public void setMvcFrameworks(String[] mvcFrameworks) {
		this.mvcFrameworks = mvcFrameworks;
	}

	public Map<String, String> getPreparedMVCFrameworks() {
		Map<String, String> mvcFrameworksMap = new LinkedHashMap<String, String>();
		mvcFrameworksMap.put("JSF ", "JSF");
		mvcFrameworksMap.put("Spring ", "Spring");
		mvcFrameworksMap.put("Vaadin ", "Vaadin");
		return mvcFrameworksMap;
	}
	
	
}
