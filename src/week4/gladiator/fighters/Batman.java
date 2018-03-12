package week4.gladiator.fighters;

public class Batman extends Gladiator {

    private int health = 1000;
    private int strength = 20;


    @Override
    public int bit() {
        return strength + weapon.bit();
    }

    @Override
    public void defence(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health >= 0;
    }

    @Override
    public int getHeals() {
        return health;
    }

}
