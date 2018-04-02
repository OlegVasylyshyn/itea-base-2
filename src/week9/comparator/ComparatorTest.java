package week9.comparator;

import java.util.*;

public class ComparatorTest {

    public static void main(String[] args) {

        // AVL
        // Red-Black
        Map<User, String> tree = new TreeMap<>(new UserComparator());
        tree.put(new User("Oleg", 11), "wer");
        tree.put(new User("Dex", 14), "wer");
        tree.put(new User("Alex", 9), "wer");
        tree.put(new User("Dan", 10), "wer");

        tree.forEach((k, v) -> System.out.println("Key - " + k));


        List<User> users = new ArrayList<>();
        users.add(new User("Oleg", 11));
        users.add(new User("Dex", 14));
        users.add(new User("Alex", 9));
        users.add(new User("Dan", 10));
        users.sort(Comparator.comparing(o -> o.user));

        System.out.println(users);

    }



}


class User implements Comparable<User> {

    String name;
    int age;
    User user;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(User o) {
        return age - o.age;
    }
}

class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.name.compareTo(o2.name);
    }

}