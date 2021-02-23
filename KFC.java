package daalgavar;
import java.util.*;

public class KFC{

    String name;
    int unelgee;
    public KFC(String name) {
        this.name=name;
    }
    public void pr() {
        
        System.out.println("Захиалга авч байна :" + name );
    }

    public static void main(String[] args) {
        
        KFC p = new KFC("KFC");
        KFC a = new Tahianiimakh("1 ширхэг тахианы мах", 2);
        KFC b = new Burger("Зингер", 4);
        KFC c = new Coleslaw("Салат", 3);
        KFC d = new Taco("Тако", 1);
        KFC e = new Icecream("Манготой зайрмаг", 2);
        KFC f = new Fries("Шарсан төмс", 9);
        KFC g = new Tahianiimakh("2 ширхэг тахианы мах", 6);
        KFC h = new Burger("Филе", 8);
        KFC i = new Coleslaw("Нухсан төмс", 5);
        KFC j = new Tahianiimakh("3 ширхэг тахианы мах", 7);
        KFC k = new Burger("Дабл Давн", 9);
        KFC l = new Coleslaw("Том салат", 3);
        KFC m = new Tahianiimakh("4 ширхэг тахианы мах", 2);
        KFC n = new Burger("Твистер", 4);

        ArrayList<KFC> al = new ArrayList<KFC>();
        al.add(p);
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
        al.forEach(KFC::pr);

    }

}
class Tahianiimakh extends KFC{


    int unelgee;
    public Tahianiimakh(String name,int unelgee) {
        super(name);
        this.unelgee=unelgee;

    }

    public void pr1() {
        // This constructor has one parameter, name.
        System.out.println("Uran zognolt nom sonithoj baina:" + name );
    }


}
class Burger extends KFC{

    int unelgee;
    public Burger(String name,int unelgee) {
        super(name);
        this.unelgee=unelgee;

    }

    public void pr2() {
        // This constructor has one parameter, name.
        System.out.println("Tanin medeguin nom sonirhoj baina:" + name );
    }


}

class Coleslaw extends KFC{

    int unelgee;
    public  Coleslaw(String name,int unelgee) {
        super(name);
        this.unelgee=unelgee;

    }
    public void pr3() {
        // This constructor has one parameter, name.
        System.out.println("Ediin zasgiin nom sonirhoj baina:" + name );
    }


}
class Taco extends KFC{


    int unelgee;
    public Taco(String name,int unelgee) {
        super(name);
        this.unelgee=unelgee;

    }

    public void pr4() {
        // This constructor has one parameter, name.
        System.out.println("Adal yvdalt nom sonithoj baina:" + name );
    }


}
class Icecream extends KFC{

    int unelgee;
    public Icecream(String name,int unelgee) {
        super(name);
        this.unelgee=unelgee;

    }

    public void pr5() {
        // This constructor has one parameter, name.
        System.out.println("Orchin uyiin nom sonirhoj baina:" + name );
    }


}

class  Fries extends KFC{

    int unelgee;
    public Fries(String name,int unelgee) {
        super(name);
        this.unelgee=unelgee;

    }
    public void pr6() {
        // This constructor has one parameter, name.
        System.out.println("Tuuhen nom sonirhoj baina:" + name );
    }
}



