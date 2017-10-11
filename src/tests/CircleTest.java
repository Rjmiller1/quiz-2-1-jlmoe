package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;

public class CircleTest {
	private final double DELTA = 0.01;
	
	@Test
	public void testCircle() {
		Circle c = new Circle(1);
		assertEquals(1, c.getRadius(), DELTA);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeCircle(){
		new Circle(-1);
	}

	@Test
	public void testGetRadius() {
		Circle c = new Circle(1);
		assertEquals(1, c.getRadius(), DELTA);
	}

	@Test
	public void testCalculateArea() {
		Circle c = new Circle(1);
		assertEquals(3.14, c.calculateArea(), DELTA);
	}
}
