import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        addPhoneNumber("Ivanov", 1, phoneBook);
        addPhoneNumber("Ivanov", 2, phoneBook);
        addPhoneNumber("Petrov", 3, phoneBook);
        addPhoneNumber("Sidorov", 4, phoneBook);
        addPhoneNumber("Ivanov", 5, phoneBook);
        addPhoneNumber("Petrov", 6, phoneBook);
        printBook(phoneBook);

    }

    // Метод добавляющий номер(а) в телефонную книгу
    static void addPhoneNumber(String key, Integer value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int element : item.getValue()) {
                phones = phones + element + ",";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}