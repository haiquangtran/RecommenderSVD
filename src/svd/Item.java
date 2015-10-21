package svd;

public class Item {
	private FeatureVector features;
	private int id;
	private String description;

	public Item(int id, String description, int featureSize) {
		this.id = id;
		this.description = description;
		this.features = new FeatureVector(featureSize);
	}

	public String getDescription() {
		return description;
	}

	public int getId() {
		return id;
	}

	public FeatureVector getFeatureVector() {
		return features;
	}
}
