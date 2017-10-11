package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;
import shapes.Square;

public class SquareTest {
	private final double DELTA = 0.000000000000001;
	
	@Test
	public void testSquare() {
		Square s = new Square(1);
		assertEquals(1,s.getSide(), DELTA);
	}

	@Test
	public void testGetSide() {
		Square s = new Square(5);
		assertEquals(5,s.getSide(), DELTA);
	}
	
	@Test
	public void testCalculateArea() {
		Square s = new Square(2);
		assertEquals(4,s.calculateArea(), DELTA);
	}

}
