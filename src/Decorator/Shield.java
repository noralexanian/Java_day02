package Decorator;

public class Shield extends StuffDecorator {
    public Shield(Warrior warrior) {
        holder = warrior;
        System.out.println("May this shield protect me against every enemy.");

        holder.setHp(warrior.getHp() + 10);
    }
}
