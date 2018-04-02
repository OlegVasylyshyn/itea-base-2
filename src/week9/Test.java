package week9;

public class Test {


    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        I i = (I) new A();

        System.out.println("OK");
    }

}

interface I{
}
class A implements I{
}

class B extends A {
}

class C extends B{
}
//    And the following declarations:
//        A a = new A();
//        B b = new B();
//        Identify options that will compile and run without error.