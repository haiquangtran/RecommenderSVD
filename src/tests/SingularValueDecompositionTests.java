package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import svd.FeatureVector;
import svd.SingularValueDecomposition;

public class SingularValueDecompositionTests {
	private SingularValueDecomposition svd;
	private int featureSize = 5;
	private double delta = 0;

	/**
	 * Sets up the test fixture.
	 * (Called before every test case method.)
	 */
	@Before
	public void setUp() {
		svd = new SingularValueDecomposition();
	}

	@Test
	public void dotProductShouldReturnEstimatedValueOfOne() {
		//		assertEquals(0, featureVector.dotProduct(featureVector), delta);
		//		assertEquals(0, featureVector.dotProduct(new FeatureVector(new double[]{1,2,3,4,5})), delta);
		//		assertEquals(0, featureVector.dotProduct(new FeatureVector(new double[]{-1,-1,-1,-1,-1})), delta);
	}

	@Test
	public void dotProductShouldReturnEstimatedValuesOfFive() {
		//		assertEquals(0, featureVector.dotProduct(new FeatureVector(new double[]{-1,-1,-1,-1,-1})), delta);
	}
}
