package Java_Level_2.lesson_3;

import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) {
        String[] array = new String[]{
                "cat", "dog", "snake", "dolphin", "bird", "bear",
                "cat", "dog", "snake", "cat", "cat"
        };
        List<String> list = new ArrayList<>(Arrays.asList(array));
        Map<String, Integer> result = new HashMap<>();

        //испольуем специальный метод, считающий повторения li в list
        for (String li : list) {
            result.put(li, Collections.frequency(list, li));
        }
        System.out.println(result);

        //второй вариант
        result = new HashMap<>();

        for (String word : list) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
                continue;
            }
            result.put(word, 1);
        }
        System.out.println(result);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "123");
        phoneBook.add("Ivanov", "234");
        phoneBook.add("Ivanov", "345");
        phoneBook.add("Petrov", "456");
        phoneBook.add("Sidorov", "567");
        phoneBook.get("Ivanov");
        phoneBook.get("Petrov");

    }
}
