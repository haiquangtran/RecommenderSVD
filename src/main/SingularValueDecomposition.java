package main;

public class SingularValueDecomposition {
	private Parameters parameters = new Parameters();
	private Matrix ratings = new Matrix(5, 5);
	
	SingularValueDecomposition() {
		
	}
	
	FeatureVector test = new FeatureVector(5);

	
	
	public class Parameters {
		// Default values
		private int featureSize;
		private int iterations;
	}
}

