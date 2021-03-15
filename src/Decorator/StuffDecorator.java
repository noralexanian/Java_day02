package Decorator;

public class StuffDecorator extends Warrior {
    protected Warrior holder;

    @Override
    public int getDmg() { return holder.getDmg(); }
    @Override
    public int getHp() { return holder.getHp(); }
    @Override
    public void setDmg(int dmg) { holder.setDmg(dmg); }
    @Override
    public void setHp(int hp) { holder.setHp(hp); }
}
