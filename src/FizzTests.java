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
}
