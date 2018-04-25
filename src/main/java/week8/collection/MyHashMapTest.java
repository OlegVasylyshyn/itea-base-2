package week8.collection;

import week5.object.User;

public class MyHashMapTest {

    public static void main(String[] args) {

        String key = "DEX";

        MyHashMap<User, String> map = new MyHashMap<>();
        boolean isPersisted = map.put(new User(), key);
        System.out.println("Was persisted - " + isPersisted);
        isPersisted = map.put(new User(), key);
        System.out.println("Was persisted - " + isPersisted);
        isPersisted = map.put(new User(), key);
        System.out.println("Was persisted - " + isPersisted);
        isPersisted = map.put(new User(), key);
        System.out.println("Was persisted - " + isPersisted);

        String found = map.get(new User());
        System.out.println("Was found - " + found);

    }

}
