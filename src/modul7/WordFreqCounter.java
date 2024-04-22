package modul7;

public class WordFreqCounter {
    public  float countFreq(String phrase, String word){


        String[] words=phrase.split("\\s+");
        int count=0;
        for (String w: words) {
        if (w.equalsIgnoreCase(word)){
            count++;
        }
        }
        float frequency=(float) count/ words.length;

       return (float) frequency;
    }
}
class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}