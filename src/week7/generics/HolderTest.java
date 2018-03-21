package week7.generics;

import week5.object.User;

public class HolderTest {

    public static void main(String[] args) {

        // Covariance
        Holder<? extends CharSequence> anExtends = getExtends();

        // Contravariance
        Holder<? super CharSequence> aSuper = getSuper();

    }

    private static Holder<? extends CharSequence> getExtends(){
        return new Holder<String>("");
    }

    private static Holder<? super CharSequence> getSuper(){
        return new Holder<Object>("");
    }

    private static Holder<?> getAll(){
        return new Holder<Integer>(1);
    }

}
