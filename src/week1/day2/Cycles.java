package week1.day2;

public class Cycles {

    public static void main(String[] args) {

//        for(int i = 0, k = 100; i < 10 || k < 20; i++, k--) {
//            System.out.println("DEX");
//        }

//        int i = 0;
//        while (i++ < 10) {
//            System.out.println(i);
//        }

        int i = 0;
        do {

            if(i == 5) {
                System.out.println("here is 5");
                continue;
            }

            System.out.println(i);

        } while (i++ < 10);

    }

}
