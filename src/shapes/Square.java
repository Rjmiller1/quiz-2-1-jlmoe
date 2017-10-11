package shapes;

public class Square extends Shape {
	private double side;

	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Squares must have a positive side length.
	 */
	public Square(double side) throws IllegalArgumentException{
		// TODO Implement me
		if (side <= 0){
			throw new IllegalArgumentException();
		}
	}
	
	/*
	 * Implement any remaining methods demanded by the superclass.
	 */

	public double getSide() {
		return side;
	}

	public double calculateArea() {
		double area = Math.pow(side, 2);
		return area;
	}
}
