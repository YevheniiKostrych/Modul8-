package modul7;

public class MathDetector {
    public boolean isMath(String text){
        char []chars=text.toCharArray();
        char eqals='=';
        char plus ='+';
        char minus ='-';
        char divition ='/';
        char multiply='*';
      boolean result=false;

        int count=0;
        int count1=0;
        int count2=0;





        for (char c:chars) {
          if (Character.isDigit(c)){
              count2++;
          }
            if (c == plus||c==minus||c==divition||c==multiply){
                count1++;
            }
            if (c == eqals){
                count++;
            }


        }
        if (count>=1&&count1>=1&&count2>=2){
            result= true;
        }
        return  result;
    }
}
class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}