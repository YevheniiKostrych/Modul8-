package modul7;

public class SummaryCreator {
    public String create(String text){
        char[] chars=text.toCharArray();
        StringBuilder stringBuilder =new StringBuilder();
        if (chars.length<=15){
            for (char c:chars){
                stringBuilder.append(c);
            }
        }
        else if (chars.length>=16){
            if (chars[15] != ' '){
                for (int i = 0; i < 15; i++) {
                    stringBuilder.append(chars[i]);
                }stringBuilder.append("...");
                }
            else
                for (int i = 0; i < 15; i++) {


                stringBuilder.append(chars[i]); }


            }
        return stringBuilder.toString();
        }
    }

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Marsbbbbbbbbbbb bbbb";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}