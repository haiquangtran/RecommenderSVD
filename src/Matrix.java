
public class Matrix {
	private double[][] matrix;
	
	public Matrix(int numOfUsers, int numOfItems) {
		this.matrix = new double[numOfUsers][numOfItems];
	}
	
	public double[][] getMatrix() {
		return matrix;
	}
	
}
