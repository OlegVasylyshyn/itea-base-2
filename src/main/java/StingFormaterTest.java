public class StingFormaterTest {

    public static void main(String[] args) {

        int x, y, z;
        x = y = z = 10;
        System.out.println(z + y + x);


        int number = 123;
        double floatingNumber = 12.123;

//        String format = String.format("Sting %s, integer %d, float - %.2f", str, number, floatingNumber);
        System.out.printf("Sting %s, integer %d, float - %.2f", "wer", number, floatingNumber);

    }

}
