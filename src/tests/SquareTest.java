package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;
import shapes.Square;

public class SquareTest {
	private final double DELTA = 0.001;
	
	@Test
	public void testCalculateArea() {
		Square c = new Square(1);
		assertEquals(1, c.calculateArea(), DELTA);
	}

	@Test
	public void testSquare() {
		Square c = new Square(1);
		assertEquals(1, c.getSide(), DELTA);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeSquare(){
		new Square(-1);
	}

	@Test
	public void testGetRadius() {
		Square c = new Square(1);
		assertEquals(1, c.getSide(), DELTA);
	}

}
