package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NewArrayList<String> newArrayList = new NewArrayList<>();
        System.out.println(newArrayList);
        ArrayList<String> arrayList = new ArrayList<>(14);
        System.out.println(arrayList);

        System.out.println("Using ArrayList String elements");
        NewArrayList<String> list = new NewArrayList<>();
        list.add("first element");
        list.add("second element");
        list.add("third element");
        list.add("quarters element");
        System.out.println("add 4 elements");
        System.out.println(list);
        System.out.println("*************");

        System.out.println("add 13 more elements");
        for (int i = 0; i < 13; i++) {
            list.add("*");
        }
        System.out.println(list);
        System.out.println("*************");

        System.out.println("Getting 3 element");
        System.out.println("element 3 = "+ list.get(2));
        String element3 = list.get(2);
        System.out.println(list);
        System.out.println("*************");

        System.out.println("Getting size list");
        System.out.println("size = "+ list.size());
        System.out.println("*************");

        System.out.println("method clear");
        list.clear();
        System.out.println("size = " + list.size());
        System.out.println(list);
        System.out.println("*************");

        System.out.println("Using new ArrayList Integer elements");
        NewArrayList<Integer> intList = new NewArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(intList);
        System.out.println("*************");


        Integer getElem = intList.get(2);
        System.out.println("Getting Integer element 3: " + intList.get(2));

    }
}
