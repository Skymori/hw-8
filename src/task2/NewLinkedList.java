package task2;

import java.util.StringJoiner;

public class NewLinkedList<L> {
    private Node<L> firstNode;
    private Node<L> lastNode;
    private int size;

    public NewLinkedList() {
        this.firstNode = new Node(null,null,lastNode);
        this.lastNode = new Node(null,firstNode,null);
        lastNode.setPrevElement(firstNode);
        this.size = 0;
    }
    public void addFirst(L l){
        Node<L> addNode = firstNode;
        addNode.setCurrentElement(l);
        firstNode = new Node<>(null,null,addNode);
        addNode.setPrevElement(firstNode);
        size++;
    }
    public void addLast(L l){
        Node<L> addNode = lastNode;
        addNode.setCurrentElement(l);
        lastNode = new Node<>(null, addNode,null);
        addNode.setNextElement(lastNode);
    }
    public boolean add(L l){
        addLast(l);
        return true;
    }
    public boolean remove(int index){
        if (index >= 0 && index < size){
            Node<L> nodeRemove = getNodeIndex(index);
            Node<L> nodePrev = nodeRemove.getPrevElement();
            Node<L> nodeNext = nodeRemove.getNextElement();
            nodePrev.setNextElement(nodeNext);
            nodeNext.setPrevElement(nodePrev);
            nodeRemove = new Node<>(null,null,null);
            size--;
            return true;
        }else
        return false;
    }
    public void clear(){
        for (int i = 0; i < size; i++) {
            Node<L> node = getNodeIndex(0);
            node.setPrevElement(null);
            node.setCurrentElement(null);
            node.setNextElement(null);
        }
        size = 0;
    }
    public int size(){
        return size;
    }
    public L getElementIndex(int count){
        Node<L> target = firstNode.getNextElement();
        for (int i = 0; i < count; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();

    }
    public Node<L> getNextElement(Node<L> current){
        return current.getNextElement();
    }
    private Node<L> getNodeIndex(int count){
        Node<L> target = firstNode.getNextElement();
        for (int i = 0; i < count; i++) {
            target = getNextElement(target);
        }
        return target;
    }

    @Override
    public String toString() {
        String textSt = "NewLinkedList: "+
                "size=" + size +'{';
        StringJoiner textJoin = new StringJoiner(", ", textSt, "}");
        for (int i = 0; i < size; i++) {
            textJoin.add("" + getElementIndex(i));
        }
        return textJoin.toString();
    }
}
