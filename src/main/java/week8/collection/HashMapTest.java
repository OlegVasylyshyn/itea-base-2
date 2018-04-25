package week8.collection;

import week5.object.User;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {

//        Map<User, Integer> map = new HashMap<>();
//        map.put(new User(""), 10);
//        map.put(new User("Dex"), 11);
//        map.put(new User("Jason"), 12);
//        map.put(new User("James"), 13);
//
//        System.out.println();
//
//        Set<Map.Entry<User, Integer>> entries = map.entrySet();
//        for(Map.Entry<User, Integer> entry : entries) {
//            System.out.println("Key - " + entry.getKey());
//            System.out.println("Value - " + entry.getValue());
//        }
//
//        System.out.println();
//
//        map.forEach((k, v) -> {
//            System.out.println("Key - " + k);
//            System.out.println("Value - " + v);
//        });

        List<User> userList = new ArrayList<>();
        Map<String, User> users = new HashMap<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            userList.add(new User("Dex" + i));
        }
        long endTime = System.nanoTime();
        System.out.println("Init AL - " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            users.put("Dex" + i, new User("Dex" + i));
        }
        endTime = System.nanoTime();
        System.out.println("Init Map - " + (endTime - startTime));


        // Dex500
        startTime = System.nanoTime();
        System.out.println(userList.contains(new User("Dex1000000")));
        endTime = System.nanoTime();
        System.out.println("Search time AL - " + (endTime - startTime));


        startTime = System.nanoTime();
        System.out.println(users.get("Dex1000000"));
        endTime = System.nanoTime();
        System.out.println("Search time Map - " + (endTime - startTime));


}

}
