package task2;

public class Main {
    public static void main(String[] args) {
        NewLinkedList<String> list = new NewLinkedList<>();
        System.out.println("New LList size" + list.size());
        list.addLast("1");
        list.addLast("9");
        list.addFirst("a");
        list.addFirst("b");
        System.out.println("List aad last and first element" + list);
        System.out.println("Remove first element on list " +list.remove(0));
        System.out.println(list);
        System.out.println("Remove 13th element " + list.remove(12));
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
