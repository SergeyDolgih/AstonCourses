public class Main {
    public static void main(String[] args) {
        String[] words = {"волк", "заяц", "лиса", "медведь", "собака", "кот", "волк", "заяц", "волк", "лиса", "волк", "кот", "волк"};

        ArrayWords wordCollection = new ArrayWords(words);

        System.out.println("Список уникальных слов:");
        wordCollection.getUniqueWords().forEach(System.out::println);

        System.out.println("\nКоличество повторений каждого слова:");
        wordCollection.getWordCounts().forEach((word, count) -> System.out.println(word + ": " + count));

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Сидоров", "+375(12)345-67-89");
        phoneBook.add("Петров", "+375(12)345-67-88");
        phoneBook.add("Кузнецов", "+375(12)345-67-87");
        phoneBook.add("Гаврилов", "+375(12)345-67-86");
        phoneBook.add("Петров", "+375(12)345-67-85");
        phoneBook.add("Иванов", "+375(12)345-67-84");

        phoneBook.get("Петров");
        phoneBook.get("Иванов");
        phoneBook.get("Кузнецов");
        phoneBook.get("Гаврилов");
        phoneBook.get("Сидоров");
        phoneBook.get("Пупкин");
    }
}