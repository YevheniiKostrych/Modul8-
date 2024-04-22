package modul7;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UniqueCharCounter {
    public int count(String phrase){
        Set<Character> uniqueChars =new HashSet<>();
        for (int i = 0; i < phrase.length(); i++) {
            uniqueChars.add(phrase.charAt(i));
        }
        return uniqueChars.size();
    }
}
class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
