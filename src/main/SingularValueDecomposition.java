package main;

import java.util.ArrayList;

public class SingularValueDecomposition {
	private ArrayList<Rating> ratings = new ArrayList<Rating>();
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Item> items = new ArrayList<Item>();
	private Parameters parameters = new Parameters();

	SingularValueDecomposition() {
		
	}
	
	public void train(User user, Item item, Rating rating) {
		double error = parameters.learningRate * (rating.getRating() - predictRating(user, item));
		
		user.getFeatureVector().getFeatures()[0] += error * item.getFeatureVector().getFeatures()[0];
		item.getFeatureVector().getFeatures()[0] += error * user.getFeatureVector().getFeatures()[0];
	}
	
	public double predictRating(User user, Item item) {
		return user.getFeatureVector().dotProduct(item.getFeatureVector());
	}
	
	public class Parameters {
		// Default values
		private int featureSize = 10;
		private int iterations = 10;
		private double learningRate = 0.001;
	}
}

