import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guestCollection;
    private String type;

    public Bedroom(int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guestCollection = new ArrayList<>();
        this.type = type;
    }


    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getType() {
        return this.type;
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
