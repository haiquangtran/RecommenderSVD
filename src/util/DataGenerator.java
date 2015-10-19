package util;

public class DataGenerator {
	private int numOfUsers;
	private int numOfItems;
	private int numOfRatings;
	
	public DataGenerator(int numOfUsers, int numOfItems, int numOfRatings) {
		this.numOfItems = numOfItems;
		this.numOfRatings = numOfRatings;
		this.numOfUsers = numOfUsers;
	}

}
