package week4.gladiator;

import week4.gladiator.fighters.Batman;
import week4.gladiator.fighters.Gladiator;
import week4.gladiator.fighters.Spiderman;
import week4.gladiator.weapon.Axe;
import week4.gladiator.weapon.Blade;
import week4.gladiator.weapon.Bow;
import week4.gladiator.weapon.Weapon;

public final class Arena {

    private Arena(){
    }

    private static final Arena INSTANCE;

    private Gladiator batman = new Batman();
    private Gladiator spiderman = new Spiderman();

    private Weapon[] weapons = new Weapon[] {new Axe(), new Blade(), new Bow()};


    static {
        INSTANCE = new Arena();
    }

    public static Arena getInstance() {
        return INSTANCE;
    }

    public void start() {
        while (batman.isAlive() || spiderman.isAlive()) {
            System.out.println("Batman has - " + batman.getHeals());
            System.out.println("Spiderman has - " + spiderman.getHeals());

            Weapon weaponForBatman = weapons[(int) (Math.random() * 3)];
            Weapon weaponForSpiderman = weapons[(int) (Math.random() * 3)];
            batman.changeWeapon(weaponForBatman);
            spiderman.changeWeapon(weaponForSpiderman);

            spiderman.defence(batman.bit());
            batman.defence(spiderman.bit());

        }

        if(batman.isAlive()) {
            System.out.println("Batman won");
        } else if(spiderman.isAlive()) {
            System.out.println("Spiderman won");
        } else {
            System.out.println("Draw");
        }
    }

}
