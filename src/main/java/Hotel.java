import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList bedrooms, ArrayList conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public void checkInGuestBedroom(Bedroom bedroom, Guest guest) {
        bedroom.addGuest(guest);
    }

    public void checkInGuestConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.addGuest(guest);
    }

    public void checkOutGuestBedroom(Bedroom bedroom, Guest guest) {
        bedroom.removeGuest(guest);
    }

    public void checkOutGuestConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.removeGuest(guest);
    }
}
