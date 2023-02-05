// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.


import java.util.HashMap;
import java.util.List;

public class task1 
{
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Петров");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Иванов", List.of("+7(121)131-14-12", "+7(232)242-25-26"));
        phoneBook.put("Петров", List.of("+7(343)353-36-37", "+7(454)464-47-48"));
        phoneBook.put("Сидоров",List.of("+7(565)575-58-59", "+7(676)686-69-60"));

    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}