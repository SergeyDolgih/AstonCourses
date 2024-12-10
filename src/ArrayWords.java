import java.util.*;

public class ArrayWords {

    private final String[] words;

    public ArrayWords(String[] words) {
        this.words = words;
    }

    public Set<String> getUniqueWords() {
        return new HashSet<>(Arrays.asList(words));
    }

    public Map<String, Integer> getWordCounts() {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }
}