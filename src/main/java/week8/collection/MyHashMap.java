package week8.collection;

public class MyHashMap<K, V> {

    private Node<K, V>[] table = new Node[15];


    public boolean put(K key, V value) {
        int i = getIndex(key);

        Node<K, V> tmp = table[i];
        if(tmp == null) {
            table[i] = new Node<>(key, value);
            return true;
        }

        if(tmp.key.equals(key)) return false;

        Node<K, V> t1 = tmp.next;
        Node<K, V> t2 = tmp.next;
        while (t1 != null) {
            t2 = t1;
            t1 = t1.next;
        }

        t2.next = new Node<>(key, value);
        return true;
    }

    public V get(K key) {
        int i = getIndex(key);
        if(table[i] == null) return null;
        return table[i].value;
    }

    private int getIndex(K key) {
        int hash = key.hashCode();
        hash = Math.abs(hash);
        return hash % table.length;
    }


    private static class Node<K, V> {

        K key;
        V value;

        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
