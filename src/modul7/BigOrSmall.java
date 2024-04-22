package modul7;

import java.util.ArrayList;
import java.util.List;

class BigOrSmall {
    public String calculate(String text){
        String result = null;
        List<Character>upCase=new ArrayList<>() ;
        List<Character>lowCase=new ArrayList<>() ;
        for (char c:text.toCharArray()){
            if (Character.isUpperCase(c)){
                upCase.add(c);
            }
            if (Character.isLowerCase(c)){
                lowCase.add(c);
            }
        }
        if (upCase.size()>lowCase.size()){
            result="Big";
        }
        if (upCase.size()<lowCase.size()){
            result="Small";
        }
        if (upCase.size()==lowCase.size()){
            result="Same";
        }
        return result;
    }
}
class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}