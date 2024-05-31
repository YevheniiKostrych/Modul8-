package modul8.sevenElementsDigit;

import modul8.sevenElementsDigit.input.KeybordReader;
import modul8.sevenElementsDigit.input.KeybordReaderNumber;
import modul8.sevenElementsDigit.input.StringNumberReader;
import modul8.sevenElementsDigit.output.DigitPrinter;
import modul8.sevenElementsDigit.output.SevenElementDigitPrinter;
import modul8.sevenElementsDigit.output.SimpleDigitPrinter;
import modul8.sevenElementsDigit.splitter.Splitter;

public class DigitRunner {
    public static void main(String[] args) {
        KeybordReader keybordReader=new KeybordReaderNumber();
        Splitter splitter=new Splitter();
        DigitPrinter digitPrinter=new SevenElementDigitPrinter();

        int number1=keybordReader.number();
        Digit[] digits=splitter.split(number1);
        digitPrinter.print(digits);
    }
}
