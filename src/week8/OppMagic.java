package week8;

public class OppMagic {

    public static void main(String[] args) {

        A a = new B();
        System.out.println(a.x);

    }

}

class A {

    int x = 1;

    void f(){
        System.out.println("A");
    }
}

class B extends A {

    int x = 2;

    void f(){
        System.out.println(super.x);
    }
}
