package week7.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ListTest {

    private static List<Integer> ints = new ArrayList<>();

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(5);
        collection.add(1);
        collection.add(2);

        ints.add(1);
        ints.add(2);
        ints.add(0, 5);
        ints.add(7);
        ints.add(2);
        ints.add(10);
        ints.add(3);
        ints.add(6);


        for(Integer num : ints) {
            System.out.println(num);
        }

        // Custom lambda example
        MyFunctionalInterface i = () -> "Hello World";
        i.ff();

        // Consumer lambda example
        System.out.println("Lambda");
        ints.forEach(e -> System.out.println(e));

        // Consumer method reference
        System.out.println("Method reference");
        ints.forEach(System.out::println);

        // For-each oldfasion
        for(Integer num : ints){
            System.out.println(num);
        }

        ////////////////////////////////


        // Functional style
        List<String> strs = ints.stream()
                .filter(e -> e > 5)
                .map(e -> "" + e)
                .collect(toList());

        // Imperative style
        List<String> ss = new ArrayList<>();
        for (Integer num : ints){
            if(num > 5){
                ss.add("" + num);
            }
        }

        System.out.println("Old. New arraylist with strings - ");
        System.out.println(ss);

        System.out.println("New arraylist with strings - ");
        System.out.println(strs);

        ints.removeIf(e -> e > 5);
        System.out.println("After removeIf " + ints);

        // Folding
        ints.stream()
                .reduce((e1, e2) -> e1 + e2)
                .ifPresent(System.out::println);

        // Folding with empty List
        ints.clear();
        ints.stream()
                .reduce((e1, e2) -> e1 + e2)
                .ifPresent(System.out::println);

    }

    private static void ff(){
        System.out.println("F");
    }

}

@FunctionalInterface
interface MyFunctionalInterface {
    String f();

    default void ff(){
        System.out.println(f());
    }
}
