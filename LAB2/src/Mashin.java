import java.util.*;

class Car{
	String name;
	String engine;
	String manufacturer;
	int date ;
	String type;
	public Car(String name, String engine) {
		this.name = name;
		this.engine = engine;

	}
	public void pr() {
		System.out.println("name: " + name + " engine " + engine);
	}
}
class Toyoto extends Car{
	public Toyoto(String type, String name, String engine, String manufacturer, int date) {
		super(name, engine);
		this.manufacturer = manufacturer;
		this.date = date;
		this.type = type;
	}
	public void pr() {
		System.out.println("type: " + type + "\tname: " + name + "\tengine: " + engine + "\tmanufacturer: " + manufacturer + "\tdate: " + date);
	}
}

class Nissan extends Car{
	public Nissan(String type, String name, String engine, String manufacturer, int date) {
		super(name, engine);
		this.manufacturer = manufacturer;
		this.date = date;
		this.type = type;
	}
	public void pr() {
		System.out.println("type: " + type + "\tname: " + name + "\tengine: " + engine + "\tmanufacturer: " + manufacturer + "\tdate: " + date);
	}
}
class Kia extends Car{
	public Kia(String type, String name, String engine, String manufacturer, int date) {
		super(name, engine);
		this.manufacturer = manufacturer;
		this.date = date;
		this.type = type;
	}
	public void pr() {
		System.out.println("type: " + type + "\tname: " + name + "\tengine: " + engine + "\tmanufacturer: " + manufacturer + "\tdate: " + date);
	}
}
class Honda extends Car{
	public Honda(String type, String name, String engine, String manufacturer, int date) {
		super(name, engine);
		this.manufacturer = manufacturer;
		this.date = date;
		this.type = type;
	}
	public void pr() {
		System.out.println("type: " + type + "\tname: " + name + "\tengine: " + engine + "\tmanufacturer: " + manufacturer + "\tdate: " + date);
	}
}
class Suzuki extends Car{
	public Suzuki(String type, String name, String engine, String manufacturer, int date) {
		super(name, engine);
		this.manufacturer = manufacturer;
		this.date = date;
		this.type = type;
	}
	public void pr() {
		System.out.println("type: " + type + "\tname: " + name + "\tengine: " + engine + "\tmanufacturer: " + manufacturer + "\tdate: " + date);
	}
}
public class Mashin{
	public static void main(String[] args) {
		Car t = new Toyoto("Toyoto", "Land Cruiser 200", "gasoline", "Japan", 2016);
		Car tt = new Toyoto("Toyoto", "Premio", "gasoline", "Japan", 2001);
		Car ttt = new Toyoto("Toyoto", "Prius 20", "hybrid", "Japan", 2003);
		Car to = new Toyoto("Toyoto", "Harrier", "gasoline", "Japan", 1997);
		Car too = new Toyoto("Toyoto", "Crown", "gasoline", "Japan", 1955);
		Car tto = new Toyoto("Toyoto", "Aqua", "hydrid gasoline", "Japan", 2011);
		Car n = new Nissan("Nissan", "X-Trail", "gasoline", "Japan", 2000);
		Car nn = new Nissan("Nissan", "Tiida", "gasoline", "Japan", 2004);
		Car nnn = new Nissan("Nissan", "Note", "gasoline", "Japan and United Kingdom", 2004);
		Car ni = new Nissan("Nissan", "March", "gasoline", "Japan", 1982);
		Car nni = new Nissan("Nissan", "Patrol", "gasoline", "Japan and USA", 2005);
		Car nis = new Nissan("Nissan", "Murano", "gasoline", "USA", 2003);
		Car k = new Kia("Kia", "Picanto", "gasoline", "South Korea", 2004);
		Car kk = new Kia("Kia", "Bongo", "gasoline", "South Korea", 2004);
		Car kkk = new Kia("Kia", "Cadenza", "gasoline", "South Korea", 2009);
		Car ki = new Kia("Kia", "K9", "gas", "South Korea", 2012);
		Car kii = new Kia("Kia", "Optima", "gas, hyprid", "Europe", 2000);
		Car kia = new Kia("Kia", "Sportage", "gasoline", "South Korea", 1998);
		Car h = new Honda("Honda", "HR-V", "gasoline", "Japan", 1998);
		Car hh = new Honda("Honda", "Insight", "gasoline, hybrid", "Japan", 2000);
		Car hhh = new Honda("Honda", "Civic", "gasoline", "Japan", 2005);
		Car ho = new Honda("Honda", "CAPA", "gasoline", "Japan", 1998);
		Car hoo = new Honda("Honda", "Crossroad", "gasoline", "Japan", 1993);
		Car hon = new Honda("Honda", "CR-Z", "gas hyprid", "Japan", 2010);
		Car s = new Suzuki("Suzuki", "Swift", "gasoline", "Japan", 2004);
		Car ss = new Suzuki("Suzuki", "Jimny", "gasoline", "Japan", 1970);
		Car sss = new Suzuki("Suzuki", "Escudo", "gasoline hyprid", "Japan", 1988);
		Car su = new Suzuki("Suzuki", "Vitara", "gas hyprid", "Japan", 2012);
		Car suz = new Suzuki("Suzuki", "S4X", "gas hyprid", "Japan and Italy", 2006);
		Car suzu = new Suzuki("Suzuki", "Kizashi", "gasoline", "Japan", 2009);
        
		
		
		ArrayList<Car> Object = new ArrayList<Car>();
		Object.add(t);
		Object.add(tt);
		Object.add(ttt);
		Object.add(to);
		Object.add(too);
		Object.add(tto);
		Object.add(n);
		Object.add(nn);
		Object.add(nnn);
		Object.add(ni);
		Object.add(nni);
		Object.add(nis);
		Object.add(k);
		Object.add(kk);
		Object.add(kkk);
		Object.add(ki);
		Object.add(kii);
		Object.add(kia);
		Object.add(h);
		Object.add(hh);
		Object.add(hhh);
		Object.add(ho);
		Object.add(hoo);
		Object.add(hon);
		Object.add(s);
		Object.add(ss);
		Object.add(sss);
		Object.add(su);
		Object.add(suz);
		Object.add(suzu);
        
		
		for(Car b:Object) {
			b.pr();
		}
	}
}
