package modul8.sevenElementsDigit.output;

import modul8.sevenElementsDigit.Digit;

import java.util.Arrays;
import java.util.StringJoiner;

public final class SevenElementDigitPrinter implements DigitPrinter{

      private static final String[][] PATTERNS ={
              {
              " _ ",
              "| |",
              "|_|",
              "  "
      },
              {
                      "   ",
                      "  |",
                      "  |",
                      "   "
              },
              {
                      " _ ",
                      " _|",
                      "|_ ",
                      "  "
              },
              {
                      " _ ",
                      " _|",
                      " _|",
                      "  "
              },{
              "   ",
              "|_|",
              "  |",
              "   "
      },{
              " _ ",
              "|_ ",
              " _|",
              "  "
      },{
              " _ ",
              "|_ ",
              "|_|",
              "  "
      }
              ,{
              " _ ",
              "  |",
              "  |",
              "   "
      }
              ,{
              " _ ",
              "|_|",
              "|_|",
              "   "
      }
              ,{
              " _ ",
              "|_|",
              " _|",
              "  "
      }
      };
       public void print (Digit[] digits ){
String [][]patterns= new String[digits.length][];

for (int i = 0; i <digits.length ; i++) {
               int digit=digits[i].getValue();
               patterns[i]= PATTERNS[digit];


           }



           StringJoiner line1=new StringJoiner(" ");
           StringJoiner line2=new StringJoiner(" ");
           StringJoiner line3=new StringJoiner(" ");



           for (String[]digit:patterns)
           {
               line1.add(digit[0]);
               line2.add(digit[1]);
               line3.add(digit[2]);

           }

           System.out.println(line1);

           System.out.println(line2);
           System.out.println(line3);



       }}






