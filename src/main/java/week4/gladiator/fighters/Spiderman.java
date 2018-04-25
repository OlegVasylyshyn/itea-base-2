package week4.gladiator.fighters;

public class Spiderman extends Gladiator {

    private int health = 800;
    private int strength = 30;


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
