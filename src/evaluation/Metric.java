package evaluation;

public abstract class Metric {
	private int truePositive;
	private int falsePositive;
	private int trueNegative;
	private int falseNegative;
	
	public int getTruePositive() {
		return truePositive;
	}
	
	public int getFalsePositive() {
		return falsePositive;
	}
	
	public int getTrueNegative() {
		return trueNegative;
	}
	
	public int getFalseNegative() {
		return falseNegative;
	}

}
