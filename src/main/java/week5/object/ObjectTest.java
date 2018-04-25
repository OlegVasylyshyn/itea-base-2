package week5.object;

public class ObjectTest {

    public static void main(String[] args) {

        User dex = new User("Dex",
                "123", 35,
                "Lviv", "Upa");
        System.out.println(dex);

        User jason = new User("Dex",
                "123", 35,
                "Lviv", "Upa");
        System.out.println(jason);

        System.out.println(dex.equals(jason));
        System.out.println(dex.hashCode());
        System.out.println(jason.hashCode());


        User clone = new User(dex);
        System.out.println("Cloned - " + clone);
        dex.getAddress().setCity("Ternopil");
        System.out.println("Cloned - " + clone);

        System.out.println("The End");
    }

}
