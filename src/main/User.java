package main;

public class User {
	private FeatureVector features;
	private int id;

	public User(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public FeatureVector getFeatureVector() {
		return features;
	}
}
