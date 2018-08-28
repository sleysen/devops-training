import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	protected int value1 , value2;
	Calculator calculator = new Calculator();

	@Before
	public void setUp() throws Exception {
		value1 = 16;
		value2 = 3;
	}

	@Test
	public void testClear() {
		calculator.display.setText(Double.toString(16));
		calculator.clear();
		assertTrue(calculator.display.getText().equals(""));	
	}

	@Test
	public void testGetSqrt() {
		calculator.display.setText(Double.toString(16));
		calculator.getSqrt();
		assertEquals(4, Double.parseDouble(calculator.display.getText()), 0 );
	}

	@Test
	public void testGetPosNeg() {
		calculator.display.setText(Double.toString(16));
		calculator.getPosNeg();
		assertEquals(-16, Double.parseDouble(calculator.display.getText()), 0);
	}

/*
	@Test
	public void testGetResult() {
		fail("Not yet implemented");
	}
*/
}
