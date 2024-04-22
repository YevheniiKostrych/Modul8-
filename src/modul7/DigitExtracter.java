package modul7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitExtracter {
    public int[] extract(String text){

        char [] chars =text.toCharArray();

  List<Integer> digits = new ArrayList<>();



        for (char c:chars){
            if (Character.isDigit(c)){
                digits.add(Character.getNumericValue(c));
            }
        }
        int []result = new int[digits.size()];
        for (int i = 0; i <digits.size() ; i++) {

            result[i] = digits.get(i);
        }
        return result;
    }

}

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
