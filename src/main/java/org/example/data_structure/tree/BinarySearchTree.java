package org.example.data_structure.tree;

import java.util.Comparator;

public class BinarySearchTree<K,V> {
    static class Node<K,V> {
        private final K key;
        private final V value;
        private final Node<K,V> left;
        private final Node<K,V> right;

        public Node(K key, V data, Node<K, V> left, Node<K, V> right) {
            this.key = key;
            this.value = data;
            this.left = left;
            this.right = right;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    private Node<K, V> root;
    private Comparator<? super K> comparator = null;

    private int comp(K key1, K key2) {
        return (comparator == null) ? ((Comparable<K>) key1).compareTo(key2) : comparator.compare(key1, key2);
    }

    public V search(K key) {
        Node<K, V> p = root;
        while(true) {
            if(p == null) return null;

            int cond = comp(key, p.getKey());
            if (cond == 0) {
                return p.getValue();
            } else if (cond < 0) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
    }
}
