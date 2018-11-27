import static org.junit.Assert.*;

import org.junit.Test;


public class FizzTests {

	@Test
	public void OneReturnsOne() {
		assertEquals("1", FizzBuzz.answer(1));
	}
	@Test
	public void TwoReturnsTwo() {
		assertEquals("2", FizzBuzz.answer(2));
	}
	@Test
	public void ThreeReturnsThree() {
		String expected = "Fizz";
	    String actual = FizzBuzz.answer(3);
		assertEquals(expected, actual);
	}
}
