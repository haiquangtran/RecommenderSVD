package svd;

public class FeatureVector {
	private double[] features;
	private double initValue = 0.1;

	public FeatureVector(int vectorSize) {
		this.features = new double[vectorSize];
		initializeFeatures(features);
	}

	public void initializeFeatures(double[] features) {
		for (int i = 0; i < features.length; i++) {
			features[i] = initValue;
		}
	}

	public FeatureVector(double[] features) {
		this.features = features;
	}

	public double[] getFeatures() {
		return features;
	}

	public int getFeatureLength() {
		return features.length;
	}

	/**
	 * Performs a dot product between two feature vectors where
	 * the vectors are equal lengths.
	 *
	 * @param other featureVector
	 * @return dotProduct
	 */
	public double dotProduct(FeatureVector other) {
		double result = 0.0;
		for (int i = 0; i < features.length; i++) {
			result += (features[i] * other.features[i]);
		}
		return result;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < features.length; i++) {
			result.append("[" + features[i] + "]");
		}
		return result.toString();
	}
}
