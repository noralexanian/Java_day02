package Decorator;

public abstract class Warrior {
    int hp;
    int dmg;

    public int getDmg() { return dmg; }
    public int getHp() { return hp; }
    public void setDmg(int dmg) { this.dmg = dmg; }
    public void setHp(int hp) { this.hp = hp; }
}
