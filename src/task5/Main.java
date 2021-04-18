package task5;

public class Main {
    public static void main(String[] args) {
        NewHashMap<Integer, String> newHashMap = new NewHashMap<>();
        System.out.println("Test put :");
        newHashMap.put(1,"ab");
        newHashMap.put(2,"bc");
        newHashMap.put(3,"cd");
        System.out.println(newHashMap);
        System.out.println("Test remove : ");
        newHashMap.remove(2);
        System.out.println(newHashMap);
        for (int i = 0; i < 14; i++) {
            newHashMap.put(i,"next"+ i);
        }
        System.out.println(newHashMap);
        System.out.println("Testing clear :");
        newHashMap.clear();
        System.out.println(newHashMap);
        System.out.println("Testing size :");
        System.out.println(newHashMap.size());
        for (int i = 0; i < 14; i++) {
            newHashMap.put(i,"Text"+i);
        }
        System.out.println("Test get key 4 :"+ newHashMap.get(4));
        System.out.println("Testing get key 23 :"+ newHashMap.get(23));

    }
}
