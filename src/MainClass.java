

import gui.MainFrame;

import java.util.HashMap;

import javax.swing.WindowConstants;

import svd.*;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("The meaning of life is 42");

		int featureSize = 5;

		Rating rating = new Rating(1, 1, 5);
		Rating rating2 = new Rating(2, 2, 10);
		Rating rating3 = new Rating(2, 1, -5);

		User user = new User(1, featureSize);
		User user2 = new User(2, featureSize);

		Item item = new Item(1, "This is an item", featureSize);
		Item item2 = new Item(2, "This is an item", featureSize);

		SingularValueDecomposition svd = new SingularValueDecomposition();

//		svd.getRatings().add(rating);
//		svd.getRatings().add(rating3);
//		svd.getItems().put(item.getId(), item);
//		svd.getUsers().put(user.getId(), user);
//		svd.getRatings().add(rating2);
//		svd.getItems().put(item2.getId(), item2);
//		svd.getUsers().put(user2.getId(), user2);
//		svd.train();
//
//		System.out.println(svd.predictRating(1, 1));
//		System.out.println(svd.predictRating(2, 2));
//		System.out.println(svd.predictRating(2, 1));
//		
		MainFrame gui = new MainFrame(900, 500);
	}
}
