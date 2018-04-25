package week9.comparator;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyTree<K extends Comparable<K>, V> {

    private Node<K, V> root;

    public V put(K key, V value) {

        if(root == null) {
            root = new Node<>(key, value);
            return null;
        }

        return putNode(root, key, value);
    }

    private V putNode(Node<K, V> root, K key, V value) {
        if(((Comparable<K>) root.key).compareTo(key) < 0) {
            if(root.right != null) {
                putNode(root.right, key, value);
            } else {
                root.right = new Node<>(key, value, root, null, null);
                return null;
            }
        } else {
            if(root.left != null) {
                putNode(root.left, key, value);
            } else {
                root.left = new Node<>(key, value, root, null, null);
                return null;
            }
        }
        V oldValue = root.value;
        root.value = value;
        return oldValue;
    }

    private String getString(Node<K, V> root) {
        if(root == null) return "";
        return getString(root.left) + " " + root.value + " " + getString(root.right);
    }

    @Override
    public String toString() {
        return getString(root);
    }

    private static class Node<K, V> {

        K key;
        V value;

        Node<K, V> root;
        Node<K, V> left;
        Node<K, V> right;

        public Node(K key, V value, Node<K, V> root, Node<K, V> left, Node<K, V> right) {
            this.key = key;
            this.value = value;
            this.root = root;
            this.left = left;
            this.right = right;
        }

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

}
