package week5;

public class A {

    int num;

    public<T> T getA(Class<T> tClass) throws IllegalAccessException, InstantiationException {
        Class<? extends A> aClass = this.getClass();
        if(aClass == tClass) {
            return tClass.newInstance();
        }
        return null;
    }


    public static void main(String[] args) {
        // ref instanceof A

        A a = new A();
        Object o = a;

        boolean isA = o instanceof A;
        System.out.println(isA);
    }

}

class B extends A {

}
