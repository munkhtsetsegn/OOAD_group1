package lab5;


class User {
	public int id,pNumber; 
	public String fName, lName, eMail;
	public String hotelOrder;

	public User(int id, String fname, String lname, String email, String hotelorder, int pnumber ) {
		id = id;
		fName = fname;
		lName = lname;
		eMail = email;
		hotelOrder = hotelorder;
		pNumber = pnumber;
		System.out.println("user iin baiguulagch ajillaa");
	}
	
}
class Hotel{
	public int id, pNumber;
	public String Name, Address, roomInfo, Order;
	public Hotel(int id, int pnumber, String name, String address, String roominfo, String order) {
		id = id;
		pNumber = pnumber;
		Name = name;
		Address = address;
		roomInfo = roominfo;
		Order = order;
		System.out.println("Hotel iin baiguulagch ajillaa");
	}
	public double totalRent() {
		return 0;
	}
	
}
class Route {
	
}
public class main {

	public static void main(String[] args) {
		User U = new User(0512, "Fname", "Lastname", "FL@yahoo.com", "Hotelorder", 88880808);
		Hotel H = new Hotel(1, 123, "Asd", "asdasd", "asdsd", "asd" );
		System.out.println(U.eMail);
	}

}

