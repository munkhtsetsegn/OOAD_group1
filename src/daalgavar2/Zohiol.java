package daalgavar2;
import java.util.*;

public class Zohiol{

    String name;
    int unelgee;
    public Zohiol(String name) {
        this.name=name;
    }
    public void pr() {
        // This constructor has one parameter, name.
        System.out.println("Zohiol уншиж байна. :" + name );
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Zohiol p = new Zohiol("zohiol");
        Zohiol a = new Uranzognolt("Game of the thrones", 2);
        Zohiol b = new Taninmedehuin("Odon oron sudlal", 4);
        Zohiol c = new Ediinzasgiin("Macro economics", 3);
        Zohiol d = new Adalyvdalt("Moroodliin hyzgaar", 1);
        Zohiol e = new Orchinuyiin("Humhiin tooson mor", 2);
        Zohiol f = new Tuuhen("Micro economics", 9);
        Zohiol g = new Uranzognolt("Delhiin mohol", 6);
        Zohiol h = new Taninmedehuin("Tarhi hel uhamsar", 8);
        Zohiol i = new Ediinzasgiin("Bad blood", 5);
        Zohiol j = new Uranzognolt("Uiliin ur zahialagch", 7);
        Zohiol k = new Taninmedehuin("Bodit baidliin id shid", 9);
        Zohiol l = new Ediinzasgiin("Tatvariin onol", 3);
        Zohiol m = new Uranzognolt("Legend of the Maorio", 2);
        Zohiol n = new Taninmedehuin("Modnii nuutslag amidral", 4);

        ArrayList<Zohiol> al = new ArrayList<Zohiol>();
        al.add(p);//Зохиолын обьектыг нэмэх
        al.add(a);
        al.add(b);
        al.add(c);
        al.add(d);
        al.add(e);
        al.add(f);
        al.add(g);
        al.add(h);
        al.add(i);
        al.add(j);
        al.add(k);
        al.add(l);
        al.add(m);
        al.add(n);
        al.forEach(Zohiol::pr);

    }

}
class Uranzognolt extends Zohiol{


    int unelgee;
    public Uranzognolt(String name,int unelgee) {
        super(name);
        this.unelgee=unelgee;

    }

    public void pr1() {
        // This constructor has one parameter, name.
        System.out.println("Uran zognolt nom sonithoj baina:" + name );
    }


}
class Taninmedehuin extends Zohiol{

    int unelgee;
    public Taninmedehuin(String name,int unelgee) {
        super(name);
        this.unelgee=unelgee;

    }

    public void pr2() {
        // This constructor has one parameter, name.
        System.out.println("Tanin medeguin nom sonirhoj baina:" + name );
    }


}

class Ediinzasgiin extends Zohiol{

    int unelgee;
    public Ediinzasgiin(String name,int unelgee) {
        super(name);
        this.unelgee=unelgee;

    }
    public void pr3() {
        // This constructor has one parameter, name.
        System.out.println("Ediin zasgiin nom sonirhoj baina:" + name );
    }


}
class Adalyvdalt extends Zohiol{


    int unelgee;
    public Adalyvdalt(String name,int unelgee) {
        super(name);
        this.unelgee=unelgee;

    }

    public void pr4() {
        // This constructor has one parameter, name.
        System.out.println("Adal yvdalt nom sonithoj baina:" + name );
    }


}
class Orchinuyiin extends Zohiol{

    int unelgee;
    public Orchinuyiin(String name,int unelgee) {
        super(name);
        this.unelgee=unelgee;

    }

    public void pr5() {
        // This constructor has one parameter, name.
        System.out.println("Orchin uyiin nom sonirhoj baina:" + name );
    }


}

class Tuuhen extends Zohiol{

    int unelgee;
    public Tuuhen(String name,int unelgee) {
        super(name);
        this.unelgee=unelgee;

    }
    public void pr6() {
        // This constructor has one parameter, name.
        System.out.println("Tuuhen nom sonirhoj baina:" + name );
    }
}



