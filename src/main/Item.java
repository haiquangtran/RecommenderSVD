package main;

public class Item {
	private int id;
	private String description;
	
	public Item(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	public int getId() {
		return id;
	}
}
