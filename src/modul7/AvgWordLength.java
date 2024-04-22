package modul7;

public class AvgWordLength {
    public double count(String phrase){
        String [] words=phrase.split(" ");


        char[] charsInWords=phrase.replaceAll(" ","").toCharArray();

        return (double) charsInWords.length/ words.length;
    }
}
class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
