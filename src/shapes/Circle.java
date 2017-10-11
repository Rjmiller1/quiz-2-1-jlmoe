package shapes;

public class Circle extends Shape {
	private double radius;
	
	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Circles must have a positive radius.
	 */
	public Circle(double radius) throws IllegalArgumentException {
		if(radius <= 0){
			throw new IllegalArgumentException();
		}
		
		this.radius = radius;
		
	}
	
	/*
	 *  Implement any remaining methods demanded by the superclass.
	 */
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double calculateArea(){
		double area = radius * radius * Math.PI;
		return area;
	}
}
