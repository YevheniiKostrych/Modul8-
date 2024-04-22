package modul7;
import java.util.Arrays;
public class WordSplitter {




    public String[] split(String phrase){
        String[]  splitResult=phrase.toLowerCase().replace(" ","  ").split(" \\s+");

        return splitResult;
    }
}

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}