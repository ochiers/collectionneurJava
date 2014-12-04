package Groups;

import java.util.ArrayList;

import Person.Person;

public class Groups {
	private int id;
	private String name;
	private ArrayList<Person> member;
	public ArrayList<Person> getMember() {
		return member;
	}
	public void setMember(ArrayList<Person> member) {
		this.member = member;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
