import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("The Sir Sandy McMillan Room", 100);
        guest = new Guest("Sandy McMillan");
    }

    @Test
    public void hasName(){
        assertEquals("The Sir Sandy McMillan Room", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void removeGuest() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.countGuests());
    }
}
