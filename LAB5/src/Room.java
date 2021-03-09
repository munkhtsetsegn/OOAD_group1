public class Room {
    private int room_id;
    private String room_no;
    private String Address;
    private String roomInfo;
    private int pNumber;

    private RoomFare room_class;


    public Room (String roomNo) {
        room_no = roomNo;
    }

    public int getRoom_id () {
        return room_id;
    }

    public void setRoom_id (int room_id) {
        this.room_id = room_id;
    }

    public String getRoom_no () {
        return room_no;
    }

    public void setRoom_no (String room_no) {
        this.room_no = room_no;
    }

    public String getAddress () {
        return Address;
    }
    public void setAddress (String Address) {
        this.Address = Address;
    }

    public String getRoomInfo() {
        return roomInfo;
    }

    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }

    public int getpNumber() {
        return pNumber;
    }
    public void setpNumber(int pNumber){
        this.pNumber = pNumber;
    }

    public RoomFare getRoom_class () {
        return room_class;
    }

    public void setRoom_class (RoomFare room_class) {
        this.room_class = room_class;
    }

}
