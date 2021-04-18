package task3;

public class Main {
    public static void main(String[] args) {
        NewQueue<String> stringNewQueue = new NewQueue<>();
        stringNewQueue.add("1");
        stringNewQueue.add("2");
        stringNewQueue.add("3");
        stringNewQueue.add("4");
        System.out.println(stringNewQueue);
        System.out.println();
        String first = stringNewQueue.peek();
        System.out.println("Us peek : " +first);
        System.out.println(stringNewQueue);
        System.out.println("Us pool : "+ first + stringNewQueue.poll());
        System.out.println(stringNewQueue);
        for (int i = 0; i < 14; i++) {
            stringNewQueue.add("123");
        }System.out.println("Test remove :" + stringNewQueue.remove(1));
        System.out.println(stringNewQueue);
        System.out.println("Test resizing 14 elements "+ stringNewQueue);
        System.out.println("Test clear :");
        stringNewQueue.clear();
        System.out.println(stringNewQueue);
        System.out.println("return size :" + stringNewQueue.size());

    }
}
