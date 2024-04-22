package modul7;

//public class PalindromeCounter {
//    public int count(String phrase){
//        String onlyPunctuation=phrase.replaceAll("\\p{Punct}","");
//      String[] words=onlyPunctuation.split("\\s+");
//      int count=0;
//      for (Object w: words){
//          StringBuilder reversed=new StringBuilder(w.toString());
//          String word =w.toString();
//          if (word.equalsIgnoreCase(String.valueOf(reversed.reverse()))){
//              count++;
//          }
//      }
//      return count;
//    }
//}
//class PalindromeCounterTest {
//    public static void main(String[] args) {
//        PalindromeCounter counter = new PalindromeCounter();
//
//        //1
//        System.out.println(counter.count("Level done!"));
//
//        //0
//        System.out.println(counter.count("No palindromes"));
//    }
//}
class PalindromeCounter {
   public int count(String phrase){
       String[]words =phrase.split(" ");
       int count=0;
       for (String word:words)
       {
           if(isPaindrome(word)){
               count++;
           }
       }
       return count;
   }
   private boolean isPaindrome(String word){
       String cleanWord=word.replaceAll("[^a-zA-Z]","").toLowerCase();
       return cleanWord.equals(new StringBuilder(cleanWord).reverse().toString());
   }


}
class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}
