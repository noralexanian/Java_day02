import Composite.*;
import Decorator.*;
import Factory.*;
import Observer.*;

public class Main {
    public static void main(String[] args) {
        //Call elf listening function
        Elf elf = new Elf();
        elf.listening();

        //Exercise 3
        /*Word w1 = new  Word();
        Word w2 = new  Word();
        Word w3 = new  Word();
        Word w4 = new  Word();

        SentenceComposite sc1 = new  SentenceComposite ();
        SentenceComposite  sc2 = new  SentenceComposite ();
        SentenceComposite  sc3 = new  SentenceComposite ();

        sc1.add(w1);
        sc1.add(w2);
        sc1.add(w3);

        sc2.add(w4);

        sc3.add(sc1);
        sc3.add(sc2);
        sc3.print();*/

        //Exercise 4
        /*Order order = new  Order ();
        Customer customer = new  Customer ();
        order.setObserver(customer);
        order.setData("123.5326 ,  237.9277", 10, "6W 40th Street , New  York");*/

        //Exercise 5
        /*Warrior albert = new BasicWarrior();
        System.out.println("Albert  has " + albert.getHp() + " health  points.");
        albert = new Shield(albert);
        System.out.println("Albert  has " + albert.getHp() + " health  points.");
        Warrior  georges = new KingWarrior();
        System.out.println("Georges  has " + georges.getHp() + " health  points  and canhit "+ georges.getDmg () + " damages.");
        georges = new FireSword(georges);
        georges = new  Shield(georges);
        System.out.println("Georges  has " + georges.getHp() + " health  points.");
        System.out.println("Georges  can  hit " + georges.getDmg () + " damages.");*/
    }
}