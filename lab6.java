package lab6;

public class vaccine {
	String name;
	double price;
	double storage_temp;
	String country;
	String zuvluguu;
	String rule;

	public vaccine(String ner, String countr, double pric, double temp, String zuv, String durem) {
		name = ner;
		country = countr;
		price = pric;
		storage_temp = temp;
		zuvluguu = zuv;
		rule = durem;
	}
	public void print(){
		System.out.println();
	}
}

class person {
	String name;
	vaccine choice;
	public person(String ner, vaccine vac) {
		name = ner;
		choice = vac;
	}
	public void printperson() {
		System.out.println("Person-name:" + this.name + "\nvaccine choice:" + this.choice.name + "\nVaccine country:" + this.choice.country
		+ "\nVaccine price" + this.choice.price + "\nStorage temperature:" + this.choice.storage_temp + "\nAdvice:" + this.choice.zuvluguu
		+ "\nDurem:" + this.choice.rule
		);
	}
	
	public static void main(String[] args) {
		
		vaccine v1 = new vaccine("sputnik", "Russia", 20, 4, "harshiltai hund hiihiig horiglono", "durem1");
		vaccine v2 = new vaccine("Moderna", "USA", 15, 0, "Bohirduulahaas sergiileh", "durem2");
		vaccine v3 = new vaccine("Johnson and Johnson", "China", 10, -30, "Sain untaj amrah", "durem3");

		person p1 = new person("Bat", v1);
		person p2 = new person("Dorj", v2);
		person p3 = new person("Dolgor", v3);
		p1.printperson(); p1.choice.print();
		p2.printperson(); p1.choice.print();
		p3.printperson(); p1.choice.print();
	}

}

