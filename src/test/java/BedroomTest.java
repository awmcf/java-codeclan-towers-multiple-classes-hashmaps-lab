import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(7, 2, "double", 49.99);
        guest = new Guest("Elon Musk");
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(7, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals("double", bedroom.getType());
    }

    @Test
    public void addGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void cannotAddGuest() {
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.countGuests());
    }

    @Test
    public void removeGuest() {
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void hasRate() {
        assertEquals(49.99, bedroom.getRate(), 0.001);
    }
}