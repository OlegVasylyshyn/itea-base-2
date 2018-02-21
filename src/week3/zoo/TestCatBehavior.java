package week3.zoo;

public class TestCatBehavior {

    public static void main(String[] args) {
        Cat cat = new Cat("Type", "Name", 3, "WHITE");
        jumpMethod(cat);
    }

    private static void jumpMethod(CatBehavior catBehavior) {
        catBehavior.jump();
    }

}
