package Java_Level_2.lesson_3;

import java.util.*;

public class Lesson_3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[5];
        arr2 = extendArray(arr2);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.get(0));
        list.remove(0);

        Set<Integer> set = new HashSet<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");

        map.get(1);

    }

    public static int[] extendArray(int[] arr) {
        int[] tmp = new int[arr.length * 2];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        return tmp;
    }

}
