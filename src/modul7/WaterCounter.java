package modul7;

import java.util.ArrayList;
import java.util.List;

public class WaterCounter {
    public double count(String text){

        char []charsIsAll=text.toCharArray();
        char[] charsIsFull=text.replaceAll(" ","").toCharArray();
       double result= (double) (charsIsAll.length - charsIsFull.length) /charsIsAll.length;
       return result;
    }
}
class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("       invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}