package week4.gladiator.fighters;

import week4.gladiator.weapon.Weapon;

public abstract class Gladiator {

    protected Weapon weapon;

    public abstract int bit();
    public abstract void defence(int damage);
    public abstract boolean isAlive();
    public abstract int getHeals();

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
