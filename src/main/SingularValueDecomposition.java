package main;

import java.util.ArrayList;
import java.util.HashMap;

public class SingularValueDecomposition {
	private ArrayList<Rating> ratings = new ArrayList<Rating>();
	private HashMap<Integer, User> users = new HashMap<Integer, User>();
	private HashMap<Integer, Item> items = new HashMap<Integer, Item>();
	private Parameters parameters = new Parameters();

	SingularValueDecomposition() {
		
	}
	
	/**
	 * Train SVD using Stochastic Gradient Descent
	 */
	public void train() {
		for (int i = 0; i < ratings.size(); i++) {
		}
	}
	
	public void stochasticGradientDescent(int userId, int itemId, Rating rating) {
		double error = parameters.learningRate * (rating.getItemId() - (predictRating(userId, itemId)));
		
		User user = users.get(userId);
		Item item = items.get(itemId);
		
		// Not sure if correct
		for (int i = 0; i < user.getFeatureVector().getFeatureLength(); i++) {	
			user.getFeatureVector().getFeatures()[i] += error * item.getFeatureVector().getFeatures()[i];
			item.getFeatureVector().getFeatures()[i] += error * user.getFeatureVector().getFeatures()[i];
		}
		
	}
	
	public double predictRating(int userId, int itemId) {
		User user = users.get(userId);
		Item item = items.get(itemId);
		return user.getFeatureVector().dotProduct(item.getFeatureVector());
	}
	
	public class Parameters {
		// Default values
		private int featureSize = 10;
		private int iterations = 10;
		private double learningRate = 0.001;
	}
}

