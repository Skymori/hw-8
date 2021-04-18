package task4;

public class Main {
    public static void main(String[] args) {
        NewStack<Integer> integerNewStack = new NewStack<>();
        integerNewStack.push(1);
        integerNewStack.push(2);
        integerNewStack.push(3);
        System.out.println(integerNewStack);
        System.out.println("Test add elements :");
        for (int i = 4; i <14 ; i++) {
            integerNewStack.push(i);
        }
        System.out.println(integerNewStack);
        System.out.println("Test remove element");
        integerNewStack.remove(4);
        System.out.println(integerNewStack);
        System.out.println("Test clear ");
        integerNewStack.clear();
        System.out.println(integerNewStack);
        for (int i = 1; i < 14; i++) {
            integerNewStack.push(i);
        }
        System.out.println("Test size " + integerNewStack.size());
        System.out.println("Test peek " + integerNewStack.peek());
        System.out.println(integerNewStack);
        System.out.println("Test pop "+ integerNewStack.pop());
        System.out.println(integerNewStack);
        integerNewStack.clear();
    }
}
