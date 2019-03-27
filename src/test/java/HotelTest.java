import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    Guest guest1;
    Guest guest2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom3;

    @Before
    public void before() {
        bedroom1 = new Bedroom(7, 2, "double", 56.99);
        bedroom2 = new Bedroom(2, 1, "single", 43.99);
        conferenceRoom1 = new ConferenceRoom("The Sir Sandy McMillan Room", 100);
        conferenceRoom2 = new ConferenceRoom("The Shaman Sian Mindfulness Room", 15);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);
        hotel = new Hotel(bedrooms, conferenceRooms);
        guest1 = new Guest("Elon Musk");
        guest2 = new Guest("Mark Zuckerberg");
        bedroom3 = new Bedroom(69, 2, "double", 12.99);
        conferenceRoom3 = new ConferenceRoom("The Craig King's Banquet Room", 50);
    }

    @Test
    public void canCheckInGuestToBedroom() {
        hotel.checkInGuestBedroom(bedroom1, guest1);
        assertEquals(1, bedroom1.countGuests());
    }

    @Test
    public void cannotCheckInGuestToBedroom() {
        hotel.checkInGuestBedroom(bedroom3, guest1);
        assertEquals(0, bedroom3.countGuests());
    }

    @Test
    public void canCheckInGuestToConferenceRoom() {
        hotel.checkInGuestConferenceRoom(conferenceRoom1, guest2);
        assertEquals(1, conferenceRoom1.countGuests());
    }

    @Test
    public void cannotCheckInGuestToConferenceRoom() {
        hotel.checkInGuestConferenceRoom(conferenceRoom3, guest1);
        assertEquals(0, conferenceRoom3.countGuests());
    }

    @Test
    public void canCheckoutGuestFromBedroom() {
        hotel.checkInGuestBedroom(bedroom1, guest1);
        hotel.checkOutGuestBedroom(bedroom1, guest1);
        assertEquals(0, bedroom1.countGuests());
    }

    @Test
    public void canCheckoutGuestFromConferenceRoom() {
        hotel.checkInGuestConferenceRoom(conferenceRoom1, guest2);
        hotel.checkOutGuestConferenceRoom(conferenceRoom1, guest2);
        assertEquals(0, conferenceRoom1.countGuests());
    }

    @Test
    public void canBookRoom() {
        Booking booking = hotel.bookRoom(bedroom1, 3);
        assertEquals(bedroom1, booking.getBedroom());
        assertEquals(3, booking.getNumberOfNights());
    }

}
