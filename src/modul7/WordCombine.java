package modul7;

public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord){
        char []charsLowerCaseSourseWord=sourceWord.toLowerCase().toCharArray();
        char []charsLowerCaseTargetWord=targetWord.toLowerCase().toCharArray();
        int chars=0;
        for (int i = 0; i <charsLowerCaseTargetWord.length ; i++) {
            int k = 0;
            while (i < charsLowerCaseSourseWord.length) {

                if (charsLowerCaseTargetWord[i] == charsLowerCaseSourseWord[k]) {
                    chars++;
                    break;
                }
                k++;
                if (k>=charsLowerCaseSourseWord.length) {
                    break;
            }

            }
            if (chars == charsLowerCaseTargetWord.length) {
                return true;
            }
        }

        return false;
    }
}
class WordCombineTest {
    public static void main(String[] args) {
        String sourceWord="Forest";
        String sourceWord1="Forest";
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
       System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}
