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
	public void Multiplesoffifteen() {
		String expected = "Fizz";
	    String actual = FizzBuzz.answer(15);
		assertEquals(expected, actual);
		actual = FizzBuzz.answer(15);
		assertEquals(expected, actual);
	}
}
