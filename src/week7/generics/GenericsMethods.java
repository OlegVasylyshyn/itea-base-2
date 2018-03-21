package week7.generics;

import week5.object.User;

public class GenericsMethods {

    public static void main(String[] args) {

        User user = work(new User("Dex", "123", 20, "Lviv", "Upa"));
        System.out.println(user);

        String str = work("Dex");
        System.out.println(str);

    }

    private static <E> E work(E t){
        if(t.getClass() == User.class){
            User u = (User) t;
            u.setAge(50);
            return t;
        }
        return t;
    }

}
