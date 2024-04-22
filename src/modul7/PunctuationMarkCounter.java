package modul7;

 class PunctuationMarkCounter {
    public int count(String phrase){
        String onlyPunctuation=phrase.replaceAll("[^\\p{Punct}]","");
        return onlyPunctuation.length();
    }
}
class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
