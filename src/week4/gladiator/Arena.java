package week4.gladiator;

public final class Arena {

    private Arena(){
    }

    private static final Arena INSTANCE;

    private Gladiator batman;
    private Gladiator spiderman;

    private Weapon[] weapons = new Weapon[] {};


    static {
        INSTANCE = new Arena();
    }

    public static Arena getInstance() {
        return INSTANCE;
    }

    public void start() {

    }

}
