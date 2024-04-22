package modul7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] phraseWords = phrase.split(" ");

        List<String> remainingWords = new ArrayList<>();


        for (String word : phraseWords) {
            boolean delete = false;
            for (String deleteWord : words) {
                if (word.equals(deleteWord)) {
                    delete = true;
                    break;
                }
            }
            if (!delete) {
                remainingWords.add(word);
            }
        }


        StringBuilder result = new StringBuilder();
        for (String word : remainingWords) {
            result.append(word).append(" ");
        }

        return result.toString().trim();

    }
}
class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("1 2 3 4", new String[]{"1,4"}));  String result1 = wordDeleter.remove("Hello Java", new String[] {"Java"});
        String result2 = wordDeleter.remove("This is Sparta odd cd", new String[] {"is", "odd"});


        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[]{"is"}));
        System.out.println(result1); // Виведе: Hello
        System.out.println(result2);
    }
}
