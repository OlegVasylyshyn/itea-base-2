public class HelloWorld {

    public static void main(String[] args) {

        byte b = 3;             // 1 byte
        short s = 10;           // 2 byte
        int number = 5 + 10;    // 4 byte
        long l = 2;             // 8 byte


        float f = 10.0f;
        double d = 10000000000000000000000.9;

        char symbol = '\'';

        boolean bool = false;
        System.out.println("Boolean - " + !bool);


        double v2 = f / d;
        System.out.println("Float result - " + v2);

        int v3 = s / b;
        System.out.println("Integer result - " + v3);

        v2 = f % d;
        System.out.println("Float result - " + v2);

        v3 = s % b;
        System.out.println("Integer result - " + v3);


        int i = 0;
        System.out.println("index = " + i--);
        System.out.println("index = " + i);

        System.out.println(number);
        System.out.println(symbol + "some");
        System.out.println(number);



        int num = 10;
//        num = num * 10;
        num *= 10;
        num += 10;
        num -= 10;
        num /= 5;

        System.out.println("Number = " + num);


//        num = (int) 10000000000000000L;
        num = (int) d; // explicit cast
        System.out.println(num);

    }

}
