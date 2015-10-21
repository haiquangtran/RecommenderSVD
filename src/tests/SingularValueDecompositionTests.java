package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import svd.FeatureVector;
import svd.Item;
import svd.Rating;
import svd.SingularValueDecomposition;
import svd.User;

public class SingularValueDecompositionTests {
	private ArrayList<Rating> ratings;
	private HashMap<Integer, User> users;
	private HashMap<Integer, Item> items;
	private SingularValueDecomposition svd;
	private int featureSize = 5;
	private double delta = 0.1;

	/**
	 * Sets up the test fixture.
	 * (Called before every test case method.)
	 */
	@Before
	public void setUp() {
		ratings = new ArrayList<Rating>();
		items = new HashMap<Integer, Item>();
		users = new HashMap<Integer, User>();
		svd = new SingularValueDecomposition(users, items, ratings);
	}

	@Test
	public void predictShouldReturnEstimatedRatingOfOne() {
		int userId = 1;
		int itemId = 1;
		// rating of 1
		createRatingHelper(userId, itemId, 1);
		svd.train();
		assertEquals(1, svd.predictRating(userId, itemId), delta);
	}

	@Test
	public void predictShouldReturnEstimatedRatingOfFive() {
		int userId = 1;
		int itemId = 1;
		// rating of 5
		createRatingHelper(userId, itemId, 5);
		svd.train();
		assertEquals(5, svd.predictRating(userId, itemId), delta);
	}

	@Test
	public void predictShouldReturnEstimatedRatingOfFiveAndTenForTwoUsers() {
		int userIdOne = 1;
		int itemIdOne = 1;
		int userIdTwo = 2;
		int itemIdTwo = 2;
		// rating of 5 and 10
		createRatingHelper(userIdOne, itemIdOne, 5);
		createRatingHelper(userIdTwo, itemIdTwo, 10);
		svd.train();
		assertEquals(5, svd.predictRating(userIdOne, itemIdOne), delta);
		assertEquals(10, svd.predictRating(userIdTwo, itemIdTwo), delta);
	}

	@Test
	public void predictShouldReturnEstimatedRatingOfNegativeOne() {
		int userId = 1;
		int itemId = 1;
		// rating of -1
		createRatingHelper(userId, itemId, -1);
		svd.train();
		assertEquals(-1, svd.predictRating(userId, itemId), delta);
	}
	
	private void createRatingHelper(int userId, int itemId, int rating) {
		svd.getUsers().put(userId, new User(userId, featureSize));
		svd.getItems().put(itemId, new Item(itemId, "", featureSize));
		svd.getRatings().add(new Rating(userId, itemId, rating));
	}
}
