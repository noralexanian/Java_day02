package Decorator;

public class FireSword extends StuffDecorator {
    public FireSword(Warrior warrior) {
        holder = warrior;
        System.out.println("I can slice and burn like the wind and the flames");

        holder.setDmg(warrior.getDmg() + 3);
    }
}
