package lab2object;

public class main {

	public static void main(String[] args) {
		
//		Samartai s2 = new Samartai();
//		s2.name = "Chiher1";
//		s2.samar = "husnii samartai";
//		s2.price = 5000;
//		s2.size = "jijig";
//		s2.weight = 30;
//		System.out.println("ner: " + s2.name + "\nTurul: " + s2.samar + "\nHemjee: " 
//		+ s2.size + "\nUne: " + s2.price + "\n1 shirheg chihriin jin: " + s2.weight + "gram");
//		
		int amount = 0;
		
		Samartai samar[] = new Samartai[10];
		for(int i = 0; i<10; i++) {
			samar[i] = new Samartai();
			amount++;
			samar[i].name = ("samartai chiher" + i);
			samar[i].price = Math.random()*10000;
			int value = (int)samar[i].price;
			samar[i].price = value;
			samar[i].weight = Math.random()*100;
			int gram = (int)samar[i].weight;
			samar[i].weight = gram;
			System.out.println("ner: " + samar[i].name + "\nTurul: " + samar[i].samar + "\nHemjee: " 
			+ samar[i].size + "\nUne: " + samar[i].price + " tugrug \n1 shirheg chihriin jin: " + samar[i].weight + "gram");
		}

		
		buramtai buram[] = new buramtai[10];
		for(int i = 0; i<10; i++) {
			buram[i] = new buramtai();
			amount++;
			buram[i].name = ("buramtai chiher" + i);
			buram[i].price = Math.random()*10000;
			int value = (int)buram[i].price;
			buram[i].price = value;
			buram[i].weight = Math.random()*100;
			int gram = (int)samar[i].weight;
			buram[i].weight = gram;
			System.out.println("ner: " + buram[i].name + "\nTurul: " + buram[i].buram + "\nHemjee: " 
			+ buram[i].size + "\nUne: " + buram[i].price + " tugrug \n1 shirheg chihriin jin: " + buram[i].weight + "gram");
		}
		
		
		chocolate choc[] = new chocolate[5];
		for(int i = 0; i<5; i++) {
			choc[i] = new chocolate();
			amount++;
			choc[i].name = ("chocolatetai chiher" + i);
			choc[i].price = Math.random()*10000;
			int value = (int)choc[i].price;
			choc[i].price = value;
			choc[i].weight = Math.random()*100;
			int gram = (int)choc[i].weight;
			choc[i].weight = gram;
			System.out.println("ner: " + choc[i].name + "\nTurul: " + choc[i].chocolate + "\nHemjee: " 
			+ choc[i].size + "\nUne: " + choc[i].price + " tugrug \n1 shirheg chihriin jin: " + choc[i].weight + "gram");
		}
		
		chumugtei chumug[] = new chumugtei[5];
		for(int i = 0; i<5; i++) {
			chumug[i] = new chumugtei();
			amount++;
			chumug[i].name = ("chocolatetai chiher" + i);
			chumug[i].price = Math.random()*10000;
			int value = (int)chumug[i].price;
			chumug[i].price = value;
			chumug[i].weight = Math.random()*100;
			int gram = (int)chumug[i].weight;
			chumug[i].weight = gram;
			System.out.println("ner: " + chumug[i].name + "\nTurul: " + chumug[i].chumug + "\nHemjee: " 
			+ chumug[i].size + "\nUne: " + chumug[i].price + " tugrug \n1 shirheg chihriin jin: " + chumug[i].weight + "gram");
		}
		
		System.out.println("niit chihriin too (amount) = " + amount);
		
	}
	
		
		
	
		
		

}
