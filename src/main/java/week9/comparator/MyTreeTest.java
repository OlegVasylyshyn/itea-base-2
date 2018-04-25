package week9.comparator;

public class MyTreeTest {

    public static void main(String[] args) {


        MyTree<String, String> tree = new MyTree<>();
        tree.put("Dex", "1");
        tree.put("Oleg", "2");
        tree.put("Dan", "3");
        tree.put("Alexx", "5");
        tree.put("Zag", "3");
        tree.put("Trololo", "232");
        tree.put("123", "99");
        tree.put("sddsf", "24242");
        tree.put("wer", "111");


        System.out.println(tree);

    }

}
