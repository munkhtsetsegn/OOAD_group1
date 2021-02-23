package lab2;
import java.util.*;

class Nominkhuu{
	String name;
	String sweet;
	String market;
	String color ;
	String type;
	public Nominkhuu(String name, String sweet) {
		this.name = name;
		this.sweet = sweet;

	}
	public void pr() {
		System.out.println("name: " + name + " sweet " + sweet);
	}
}
class Caramels extends Nominkhuu{
	public Caramels (String type, String name, String sweet, String market, String color) {
		super(name,sweet);
		this.market = market;
		this.color = color;
		this.type = type;
	}
	public void pr() {
		System.out.println("type: " + type + "\tname: " + name +  "\tsweet: " + sweet + "\tmarket: " + market + "\tcolor: " + color);
	}
}

class Nougat extends Nominkhuu{
	public Nougat(String type, String name, String sweet, String market, String color) {
		super(name, sweet);
		this.market = market;
		this.color = color;
		this.type = type;
	}
	public void pr() {
		System.out.println("type: " + type + "\tname: " + name +  "\tsweet: " + sweet + "\tmarket: " + market+ "\tcolor: " + color);
	}
}
class Fizzies extends Nominkhuu{
	public Fizzies(String type, String name, String sweet, String market, String color) {
		super(name, sweet);
		this.market= market;
		this.color = color;
		this.type = type;
	}
	public void pr() {
		System.out.println("type: " + type + "\tname: " + name + "\tsweet: " + sweet + "\tmarket: " + market + "\tcolor: " + color);
	}
}
class Gummy extends Nominkhuu{
	public Gummy(String type, String name, String sweet, String market, String  color) {
		super(name, sweet);
		this.market = market;
		this.color = color;
		this.type = type;
	}
	public void pr() {
		System.out.println("type: " + type + "\tname: " + name + "\tsweet: " + sweet + "\tmarket: " + market + "\tcolor: " + color);
	}
}
class Mints extends Nominkhuu{
	public Mints(String type, String name, String sweet, String market, String color) {
		super(name, sweet);
		this.market = market;
		this.color = color;
		this.type = type;
	}
	public void pr() {
		System.out.println("type: " + type + "\tname: " + name + "\tsweet: " + sweet + "\tmarket: " + market + "\tcolor: " + color);
	}
}
public class Candy{
	public static void main(String[] args) {
		Nominkhuu c = new Caramels("Caramels", "Snickers", "vanilla", "Oman", "blue");
		Nominkhuu car = new Caramels("Caramels", "Payday", "sugar", "Burma", "red");
		Nominkhuu cara = new Caramels("Caramels", "Brachs", "milk", "Nauru", "black");
		Nominkhuu caram= new Caramels("Caramels", "M&M", "sugar", "Mexico", "white");
		Nominkhuu carame = new Caramels("Caramels", "Bon bon", "shoko", "Japan","yellow");
		Nominkhuu caramel = new Caramels("Caramels", "Twix", "sweet", "Peru", "brown");
		Nominkhuu n = new Nougat("Nougat", "Gaz", "almonds", "Iran","blue");
		Nominkhuu no = new Nougat("Nougat", "Chips", "gaso", "Italy", "orange");
		Nominkhuu nou = new Nougat("Nougat", "Giurgiu", "sugar", "Japan", "blue");
		Nominkhuu noug = new Nougat("Nougat", "Torrone", "rose", "Italy", "gray");
		Nominkhuu nouga = new Nougat("Nougat", "Turron", "corn", "USA", "blue");
		Nominkhuu nougaa = new Nougat("Nougat", "Merse", "honey", "USA", "blue");
		Nominkhuu f = new Fizzies("Fizzies", "Fizzy", "honey", "Korea", "red");
		Nominkhuu fi = new Fizzies("Fizzies", "Bongo", "sugar", "Nepal", "blue");
		Nominkhuu fiz = new Fizzies("Fizzies", "Crush", "shoko", "Qatar", "yellow");
		Nominkhuu fizz = new Fizzies("Fizzies", "Boom", "milk", "Korea", "red");
		Nominkhuu fizzi = new Fizzies("Fizzies", "Optima", "apple", "Europe","blue");
		Nominkhuu fizzie = new Fizzies("Fizzies", "Jiji", "vanilla", "Russia", "red");
		Nominkhuu g = new Gummy("Gummy", "Dindon", "rose", "Japan", "black");
		Nominkhuu gu = new Gummy("Gummy", "Smart", "milk", "Korea", "pink");
		Nominkhuu gum = new Gummy("Gummy", "Jolly", "vanilla", "Japan", "blue");
		Nominkhuu gumm = new Gummy("Gummy", "Trolli", "milk", "Japan", "pink");
		Nominkhuu gummm = new Gummy("Gummy", "Sour", "rose", "Russia", "blue");
		Nominkhuu gummmm = new Gummy("Gummy", "Haribo", "shoke", "Syria", "green");
		Nominkhuu m = new Mints("Mints", "Bobs", "sugar", "Libya", "pink");
		Nominkhuu mi = new Mints("Mints", "Sassy", "egg", "Korea", "blue");
		Nominkhuu min = new Mints("Mints", "Thank", "corn", "Japan", "violet");
		Nominkhuu mint = new Mints("Mints", "Paper", "apple", "Haiti", "green");
		Nominkhuu mintt = new Mints("Mints", "Tiny", "corn", "Serbia", "blue");
		Nominkhuu minttt = new Mints("Mints", "Dove", "hony", "Samoa", "brown");
        
		
		
		ArrayList<Nominkhuu> Object = new ArrayList<Nominkhuu>();
		Object.add(c);
		Object.add(car);
		Object.add(cara);
		Object.add(caram);
		Object.add(carame);
		Object.add(caramel);
		Object.add(n);
		Object.add(no);
		Object.add(nou);
		Object.add(noug);
		Object.add(nouga);
		Object.add(nougaa);
		Object.add(f);
		Object.add(fi);
		Object.add(fiz);
		Object.add(fizz);
		Object.add(fizzi);
		Object.add(fizzie);
		Object.add(g);
		Object.add(gu);
		Object.add(gum);
		Object.add(gumm);
		Object.add(gummm);
		Object.add(gummmm);
		Object.add(m);
		Object.add(mi);
		Object.add(min);
		Object.add(mint);
		Object.add(mintt);
		Object.add(minttt);
        
		
		for(Nominkhuu b:Object) {
			b.pr();
		}
	}
}


