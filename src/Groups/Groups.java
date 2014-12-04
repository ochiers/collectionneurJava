package Groups;

import java.util.ArrayList;

import Item.Item;

public class Groups {
	private int id;
	private String name;
	private ArrayList<Item> listItem;
	private ArrayList<String> keyword;
	private ArrayList<String> categorie;

	public ArrayList<Item> getlistItem() {
		return listItem;
	}

	public void setlistItem(ArrayList<Item> listItem) {
		this.listItem = listItem;
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

	public ArrayList<String> getKeyword() {
		return keyword;
	}

	public void setKeyword(ArrayList<String> keyword) {
		this.keyword = keyword;
	}

	public ArrayList<String> getCategorie() {
		return categorie;
	}

	public void setCategorie(ArrayList<String> categorie) {
		this.categorie = categorie;
	}
}
