package _05.datatable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "dBean")
@SessionScoped
public class DataTableBean {

	private List<Person> personList;

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	@PostConstruct
	public void initialize() {
		personList = new ArrayList<Person>();
		Person person1 = new Person("ali", "bey", "23");
		Person person2 = new Person("name2", "surname2", "20");
		Person person3 = new Person("name3", "surname3", "30");
		Person person4 = new Person("name4", "surname4", "40");
		Person person5 = new Person("name5", "surname5", "50");

		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);
	}
	
	public void deletePerson(Person person){
		personList.remove(person);
	}

}
