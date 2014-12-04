package Person;

import java.util.ArrayList;

import Groups.Groups;
import Item.Item;

public class Person {
	private int id;
	private String name;
	private ArrayList<Item> items;
	private ArrayList<Groups> groups;

	public void afficher() {
		System.out.print(id);
		System.out.println(" " + name);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public ArrayList<Groups> getGroups() {
		return groups;
	}

	public void setGroups(ArrayList<Groups> groups) {
		this.groups = groups;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
