package Java_Level_2.lesson_3;

import java.util.*;

public class PhoneBook {
    private List<String> list;
    private Map<String, List<String>> phBook;

    public PhoneBook() {
        phBook = new HashMap<>();

    }

    public void add(String lastName, String phoneNumber) {
        if (phBook.containsKey(lastName)) {
            phBook.get(lastName).add(phoneNumber);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phoneNumber);
            phBook.put(lastName, phones);
        }
    }

    public void get(String desiredName) {
        System.out.println(phBook.get(desiredName));
    }
}
