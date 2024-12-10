import java.util.*;

public class PhoneBook {
    private final Map<String, String> phoneBook;
    PhoneBook() {
        phoneBook = new HashMap<>();
    }
    public void add(String lastName,String number) {
        phoneBook.put(number, lastName);
    }
    public void get(String lastName){
        if(phoneBook.containsValue(lastName)) {
            Set<Map.Entry<String, String>> set = phoneBook.entrySet();
            for (Map.Entry<String, String> temp : set) {
                if(temp.getValue().equals(lastName)) {
                    System.out.print("\n" + temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("\nТакой фамилии нет в справочнике.");
        }
    }
}