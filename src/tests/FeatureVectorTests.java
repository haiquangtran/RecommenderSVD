package tests;

import static org.junit.Assert.assertEquals;
import main.FeatureVector;

import org.junit.Before;
import org.junit.Test;

public class FeatureVectorTests {
	private FeatureVector featureVector;
	private int featureSize = 5;
	private double delta = 0;

	/**
	 * Sets up the test fixture. 
	 * (Called before every test case method.)
	 */
	@Before
	public void setUp() {
		featureVector = new FeatureVector(featureSize);
	}

	@Test
	public void dotProductOfZerosShouldReturnZero() {	  		
		assertEquals(0, featureVector.dotProduct(featureVector), delta);
		assertEquals(0, featureVector.dotProduct(new FeatureVector(new double[]{1,2,3,4,5})), delta);
		assertEquals(0, featureVector.dotProduct(new FeatureVector(new double[]{-1,-1,-1,-1,-1})), delta);
	}

	@Test
	public void dotProductShouldReturnPositiveValues() {
		featureVector = new FeatureVector(new double[]{1,1,1,1});

		// Test positive values in feature vector
		assertEquals(4, featureVector.dotProduct(featureVector),delta);
		assertEquals(400, featureVector.dotProduct(new FeatureVector(new double[]{100,100,100,100})), delta);
		assertEquals(2.5, featureVector.dotProduct(new FeatureVector(new double[]{0,0,0,2.5})), delta);
		// Test negative values in feature vector
		featureVector = new FeatureVector(new double[]{-1,-1,-1,-1});
		assertEquals(4, featureVector.dotProduct(featureVector),delta);
	}

	@Test
	public void dotProductShouldReturnNegativeValues() {
		featureVector = new FeatureVector(new double[]{1,1,1,1});

		assertEquals(-1, featureVector.dotProduct(new FeatureVector(new double[]{-1,0,0,0})), delta);
	}
}
