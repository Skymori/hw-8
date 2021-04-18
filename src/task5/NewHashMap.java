package task5;

import java.util.StringJoiner;

public class NewHashMap<K, V>{
    private static final int DEFAULT_START_CAPACITY = 14;
    private static final float DEFAULT_FACTORY  = 0.5f;
    private Node<K,V>[] table;
    private float factory;
    private int size;

    public NewHashMap() {
        table = new Node[DEFAULT_START_CAPACITY];
        factory = table.length * DEFAULT_FACTORY;
        this.size = 0;
    }
    public void put(K key, V value){
        if (key == null){
            putNullKey(value);
        }
        int hash = hash(key);
        int index = indexFor(hash, table.length);
        addNode(key, value, hash, index);
    }
    public V remove(K key){
        Node<K,V> removeNode = null;
        Node<K,V> node = null;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null){
                if (table[i].key == key){
                    removeNode = table[i];
                    if (table[i].getNext() == null){
                        table[i] = null;
                    }else {
                        table[i] = table[i].getNext();
                    }
                    size--;
                    return removeNode.getValue();
                }
                node = table[i].getNext();
            }
            while (node != null){
                if (node.key == key){
                    removeNode = node;
                    if (node.getNext() == null){
                        node = null;
                    }else {
                        node = node.getNext();
                    }
                    size--;
                    return  removeNode.getValue();
                }
            }
        }
        return removeNode.getValue();
    }
    public void clear(){
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null){
                Node<K,V> node = table[i].getNext();
                if (node != null){
                    while (node != null){
                        if (node.getNext() != null){
                            Node<K,V> next = node.getNext();
                            node.setNext(null);
                        }else {
                            break;
                        }
                    }
                }
            }
            table[i] = null;
        }
        size = 0;
    }
    public int size(){
     return size;
    }
    public V get(K key){
        for (Node<K,V> node:table){
            if (node != null){
                if (node.key == key){
                    return node.getValue();
                }else {
                    while (node != null){
                        node = node.getNext();
                        if (node != null){
                        if (node.key == key){
                            return node.getValue();
                        }
                    }else {
                        break;
                        }
                    }
                }
            }
        }
        return null;
    }
    private Node<K,V> getNextNode(Node<K,V> current){
        return current.getNext();
    }
    private void  putNullKey(V value){
        addNode(null,value,0,0);
    }
    private static int indexFor(int h, int length){
        return h & (length - 1);
    }
    private int hash(K key){
        int h;
        return (key == null) ? 0 : (h = key.hashCode())^(h>>>16);
    }
private void addNode(K key, V value, int hash, int index){
        Node<K,V> newNode = new Node<>(hash,key,value,null);
        Node<K,V> current = table[index];
        if (current == null){
            table[index] = newNode;
            size++;
            return;
        }else {
            do {
                if (current.hash ==hash &&(current.key==key||key.equals(current.key))){
                    current.value = value;
                    return;
                }
                if (current.getNext() != null){
                    current = current.getNext();
                }else {
                    break;
                }
            } while (current != null);
            current.setNext(newNode);
            size++;
        }
}
    @Override
    public String toString() {
        String begin = "NewHashMap{" + "size = "+ size + ", node : [";
        StringJoiner joiner = new StringJoiner(",", begin,"]}");
        for (Node<K,V> node:table){
            if (node == null){
                
            }else {
                joiner.add(node.toString());
                while (node.getNext() != null){
                    node = getNextNode(node);
                    joiner.add(node.toString());
                }
            }
        }
        return joiner.toString();
    }
}
