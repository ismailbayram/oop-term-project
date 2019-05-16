import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestTime {
	
	Time time = new Time(13, 58);
	Time time2 = new Time(15, 32);

	@Test
	public void testMinutes() {
		assertEquals(58, time.getMinute());
		assertEquals(32, time2.getMinute());
	}
	
	@Test
	public void testDifference() {
		assertEquals(94, time2.getDifference(time));
	}
	
	@Test
	public void testToString() {
		assertEquals("15:32", time2.toString());
	}

}
