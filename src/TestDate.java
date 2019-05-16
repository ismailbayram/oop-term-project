import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDate {
	
	Date d1 = new Date(13,2, 2019);
	Date d2 = new Date(13,6, 2019);
	
	@Test
	void testDays() {
		assertEquals(13, d1.getDay());
		assertEquals(2, d1.getMonth());
		assertEquals(2019, d1.getYear());
	}
	
	@Test
	void testIsAfterThan() {
		assertEquals(true, d2.isAfterThan(d1));
		assertEquals(false, d1.isAfterThan(d2));
	}
	
	@Test
	void testIsBeforeThan() {
		assertEquals(false, d2.isBeforeThan(d1));
		assertEquals(true, d1.isBeforeThan(d2));
	}
	
	@Test
	void testIsValid() {
		Date d3 = new Date(35, 15, 2000);
		assertEquals(true, d3.isValid()); // because it sets today itself
	}
	
	@Test
	void testToString() {
		assertEquals("13/2/2019", d1.toString());
	}

}
