package week4.gladiator;

public abstract class Gladiator {

    private Weapon weapon;

    public abstract int bit();
    public abstract void defence(int damage);
    public abstract boolean isAlive();
    public abstract int getHeals();

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
