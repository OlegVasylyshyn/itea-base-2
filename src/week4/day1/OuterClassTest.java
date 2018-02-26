package week4.day1;

public class OuterClassTest {

    // inner class

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass);

    }

}

// outer
class OuterClass {

    public String toString(){
        return "OuterClass";
    }

}