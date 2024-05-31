package modul8.sevenElementsDigit.splitter;

import modul8.sevenElementsDigit.Digit;
import modul8.sevenElementsDigit.input.KeybordReader;

import java.util.Scanner;

public class Splitter  {
 public Digit [] split(int number){
  String[] stringsDiget=Integer.toString(number).split("");
  Digit[] result=new Digit[stringsDiget.length];
     for (int i = 0; i < stringsDiget.length; i++) {
         result[i]=Digit.valueOf(Integer.parseInt(stringsDiget[i]));
     }
     return result;
 }
}
