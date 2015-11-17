package evaluation;

import java.util.ArrayList;

import svd.Rating;
import svd.SingularValueDecomposition;

public class Evaluation {
	private ArrayList<Rating> trainingSet = new ArrayList<Rating>();
	private ArrayList<Rating> testSet = new ArrayList<Rating>();

	public Evaluation(ArrayList<Rating> trainingSet, ArrayList<Rating> testSet) {
		this.trainingSet = trainingSet;
		this.testSet = testSet;
	}
	
	public ArrayList<Rating> getTrainingSet() {
		return trainingSet;
	}
	
	public ArrayList<Rating> getTestSet() {
		return testSet;
	}
	
	// TODO: Put evaluate into SVD train method for efficiency if using this method
	public void evaluateModel(SingularValueDecomposition learntModel) {
		if (trainingSet.size() == 0 || testSet.size() == 0) {
			System.out.println("No data in training set or test set.");
		}
		
		for (Rating rating: testSet) {
			// TODO: add metrics
		}
	}


}
