package modul8.sevenElementsDigit.splitter;

import modul8.sevenElementsDigit.Digit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SpliterTest {
    public static void main(String[] args) {
        Splitter splitter=new Splitter();
        Digit[] digits=splitter.split(157);
        System.out.println(Arrays.toString(digits));
    }
}
