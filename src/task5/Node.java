package task5;

import java.util.Objects;

class Node<K,V> {
    int hash;
    K key;
    V value;
    Node<K,V> next;

    public Node(int hash, K key, V value, Node<K, V> next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }
    public int hashCode(){
        return Objects.hashCode(key) ^ Objects.hashCode(value);
    }
    public V setValue(V newValue){
        V oldValue = value;
        value = newValue;
        return oldValue;
    }
    @Override
    public String toString() {
        return "Node{" +
                "hash=" + hash +
                ", key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
