package svd;

public class User {
	private FeatureVector features;
	private int id;

	public User(int id, int featureSize) {
		this.id = id;
		this.features = new FeatureVector(featureSize);
	}

	public int getId() {
		return id;
	}

	public FeatureVector getFeatureVector() {
		return features;
	}

}
