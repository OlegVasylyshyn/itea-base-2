package week6.io.serialisation;

public class Test {

    public static void main(String[] args) {
        User dex = new User("Dex", 25);
        SerialisationUtil.persistUser(dex);

        User read = SerialisationUtil.readUser();
        System.out.println(read);
    }

}
