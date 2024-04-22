package modul7;

import java.util.Arrays;

public class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase){
        String[]words={"pass", "key", "login", "email"};
        String[]phraseWords=phrase.toLowerCase().replaceAll("\\p{Punct}",""). split(" ");
        boolean result =false;


        for (String word:phraseWords )
        {

            for (String senitivWords:words){
                if (senitivWords.equals(word)){
                    result=true;
                    break;
                }

            }
        }

        return result;

    }
}
class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass. swordfish"));
    }
}
