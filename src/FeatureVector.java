
public class FeatureVector {
	private double[] features;
	
	public FeatureVector(int latentSize) {
		features = new double[latentSize];
	}
	
	public double[] getFeatures() {
		return features;
	}
	
	public int getFeatureSize() {
		return features.length;
	}
	
	public double dotProduct(FeatureVector other) {
		
		return -1;
	}
}
