package shapes;

public class Circle extends Shape {
	private double radius;
	
	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Circles must have a positive radius.
	 */
	public Circle(double radius) throws IllegalArgumentException {
		if (radius <= 0){
			throw new IllegalArgumentException();
		}else{
			this.radius = radius;
		}
	}
	
	/*
	 *  Implement any remaining methods demanded by the superclass.
	 */
	
	public double getRadius() {
		return radius;
	}


	public double calculateArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	

}
