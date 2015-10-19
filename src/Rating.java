
public class Rating {
	private int rating;
	private int userId;
	private int itemId;
	
	public Rating(int userId, int itemId, int rating) {
		this.userId = userId;
		this.itemId = itemId;
		this.rating = rating;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public int getRating() {
		return rating;
	}
	
	public int getItemId() {
		return itemId;
	}
}
