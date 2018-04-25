package week9.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {

        Set<User> sets = new TreeSet<>();
        System.out.println("Added - " + sets.add(new User("Dex")));
        System.out.println("Added - " + sets.add(new User("Dex")));
        System.out.println("Added - " + sets.add(new User()));

        System.out.println("is present - " + sets.contains(new User("Dex")));

        for (User i : sets) {
            System.out.println(i);
        }


        String s = null;
        System.out.println(s + "Hello" + s); // nullHello
        System.out.println("hello".concat(s)); // nullPointer

    }

}


class User implements Comparable<User> {

    String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(User o) {
        if(name == null) return 0;
        return name.compareTo(o.name);
    }
}