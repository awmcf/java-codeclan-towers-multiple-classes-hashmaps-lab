import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking1;
    Hotel hotel;
    Bedroom bedroom1;

    @Before
    public void before() {
        bedroom1 = new Bedroom(3, 1, "single", 69.99);
        booking1 = new Booking(bedroom1, 3);
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom1, booking1.getBedroom());
    }

    @Test
    public void hasNumberOfNights() {
        assertEquals(3, booking1.getNumberOfNights());
    }

    @Test
    public void canGiveTotalBill() {
        assertEquals(209.97, booking1.totalBill(), 0.001);
    }
}
