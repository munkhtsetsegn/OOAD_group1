import java.util.ArrayList;
import java.util.Date;

public class Reservation {

    // int CONFIRMED = 0;
    // int RESERVED = 1;

    // required Object

    private UserInfo customer;
    ArrayList<Room> rooms;



    private int reservation_id;
    private long checkInDateTime;
    private long checkOutDateTime;
    private String bookingType;
    private int person;
    //private int roomsFare;



    public Reservation()
    {
        customer = new UserInfo();
        rooms = new ArrayList<>();
        reservation_id = -1;
        reservationType = "Reserved";

    }

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }



    public String getReservationType() {
        return reservationType;
    }

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }




    public void addRoom(String roomNo)
    {
        rooms.add(new Room(roomNo));

    }

    public void removeRoom(String roomNo)
    {
        for(Room a: rooms)
        {
            if(a.getRoom_no().equals(roomNo))
            {
                rooms.remove(a);
            }
        }
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getRoomsFare()
    {
        int total = 0;
        for(Room room:rooms)
        {
            total += room.getRoom_class().getPricePerDay();
        }
        return total;
    }

    public UserInfo getCustomer() {
        return customer;
    }

    public void setCustomer(UserInfo customer) {
        this.customer = customer;
    }



    public void setCheckOutDateTime(int checkOutDateTime) {
        this.checkOutDateTime = checkOutDateTime;
    }

    public long getCheckInDateTime() {
        return checkInDateTime;
    }

    public void setCheckInDateTime(long checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    public long getCheckOutDateTime() {
        return checkOutDateTime;
    }

    public void setCheckOutDateTime(long checkOutDateTime) {
        this.checkOutDateTime = checkOutDateTime;
    }







}
