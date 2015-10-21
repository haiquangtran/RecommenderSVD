package svd;

import java.util.ArrayList;
import java.util.HashMap;

public class SingularValueDecomposition {
	private ArrayList<Rating> ratings = new ArrayList<Rating>();
	private HashMap<Integer, User> users = new HashMap<Integer, User>();
	private HashMap<Integer, Item> items = new HashMap<Integer, Item>();
	private Parameters parameters = new Parameters();

	public SingularValueDecomposition () {
		super();
	}

	public SingularValueDecomposition(HashMap<Integer, User> users, HashMap<Integer, Item> items,ArrayList<Rating> ratings) {
		this.ratings = ratings;
		this.items = items;
		this.users = users;
	}

	/**
	 * Train SVD using Stochastic Gradient Descent
	 */
	public void train() {
		stochasticGradientDescent();
	}

	public void stochasticGradientDescent() {
		// features in a vector
		for (int rank = 0; rank < parameters.rank; rank++) {
			// iterations
			for (int epoch = 0; epoch < parameters.iterations; epoch++) {
				// all ratings
				for (int i = 0; i < ratings.size(); i++) {
					User user = users.get(ratings.get(i).getUserId());
					Item item = items.get(ratings.get(i).getItemId());

					double error = (ratings.get(i).getRating() - predictRating(user.getId(), item.getId()));

					System.out.println("ERROR : " + error + " " + predictRating(user.getId(), item.getId()));
					System.out.println(user.getFeatureVector());
					System.out.println(item.getFeatureVector());
					double userVector = user.getFeatureVector().getFeatures()[rank];
					double itemVector = item.getFeatureVector().getFeatures()[rank];

					user.getFeatureVector().getFeatures()[rank] += parameters.learningRate * (error * itemVector);
					item.getFeatureVector().getFeatures()[rank] += parameters.learningRate * (error * userVector);
				}
			}
		}
	}

	public double predictRating(int userId, int itemId) {
		User user = users.get(userId);
		Item item = items.get(itemId);
		return user.getFeatureVector().dotProduct(item.getFeatureVector());
	}

	public ArrayList<Rating> getRatings() {
		return ratings;
	}

	public HashMap<Integer, User> getUsers() {
		return users;
	}

	public HashMap<Integer, Item> getItems() {
		return items;
	}

	public class Parameters {
		// Default values
		private int iterations = 10000;
		private int rank = 5;
		private double learningRate = 0.001;
	}
}

