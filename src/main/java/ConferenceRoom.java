import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guestCollection;

    public ConferenceRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guestCollection = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addGuest(Guest guest) {
        if (capacity > guestCollection.size()) {
            this.guestCollection.add(guest);
        }
    }

    public int countGuests() {
        return this.guestCollection.size();
    }

    public void removeGuest(Guest guest) {
        this.guestCollection.remove(guest);
    }
}
