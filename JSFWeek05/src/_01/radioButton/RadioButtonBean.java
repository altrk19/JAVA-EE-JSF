package _01.radioButton;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "rBean")
public class RadioButtonBean {

	private String gender;                    //hardcoded olarak i�lem yap�ld�. Yani radiobuttonlar�n de�erleri xhtml de tan�mland�. 

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private String maritalStatus;             ////se�ilen radio'lar�n degerlerini bu diziye at�yor.

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String[] getPreparedData() {
		return new String[] { "married", "engaged", "single", "java man" };
	}
	
	private String job;
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Map<String,String> getPreparedJobs(){
		Map<String,String> jobMap = new LinkedHashMap<String,String>();
		jobMap.put("eng", "Software Engineer");
		jobMap.put("arc", "Architect");
		jobMap.put("dr", "Doctor");
		return jobMap;
	}
}
