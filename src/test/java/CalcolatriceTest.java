import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.calculator.italy.Calcolatrice;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcolatriceTest {

	private Calcolatrice c = new Calcolatrice();
	
	
	@Test
	@DisplayName("Add Test")
	void addTest() {
		float result = c.add(5, 3);
		assertEquals(8, result);
	}
	
	@Test
	@DisplayName("Subtract Test")
	void subtractTest() {
		float result = c.subtract(5, 3);
		assertEquals(2, result);
	}
	
	@Test
	@DisplayName("Division Test")
	void divideTest() {
		float result = c.divide(10, 5);
		assertEquals(2, result);
	}
	
	@Test
	@DisplayName("Multiply Test")
	void multiplyTest() {
		float result = c.multiply(5, 3);
		assertEquals(15, result);
	}
	
	@Test
	@DisplayName("Division for 0 Test")
	void divideFor0Test() {
		assertThrows(IllegalArgumentException.class, 
		() -> c.divide(10, 0),
		"dovrebbe sollevare un eccezzione");
	}
}
