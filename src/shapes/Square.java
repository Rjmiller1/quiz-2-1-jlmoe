package shapes;

public class Square extends Shape {
	private double side;

	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Squares must have a positive side length.
	 */
	public Square(double side) throws IllegalArgumentException{
		if(side <= 0){
			throw new IllegalArgumentException();
		}
		this.side = side;
	}
	
	/*
	 * Implement any remaining methods demanded by the superclass.
	 */

	public double getSide() {
		return side;
	}
	
	@Override
	public double calculateArea(){
		double area = Math.pow(side, 2);
		return area;
	}
}
