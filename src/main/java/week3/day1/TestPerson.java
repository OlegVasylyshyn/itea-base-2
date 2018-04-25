package week3.day1;

public class TestPerson {

    public static void main(String[] args) {

        Person dex = new Person(30,
                "Dex", "12414124214");

        dex.greeting();

        dex.setAge(-40);
        dex.setSingle(false);
        System.out.println("Dex age - " + dex.getAge());
        System.out.println("Is dexter single - " + dex.isSingle());



    }


}
