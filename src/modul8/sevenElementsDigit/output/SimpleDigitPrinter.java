package modul8.sevenElementsDigit.output;

import modul8.sevenElementsDigit.Digit;

public class SimpleDigitPrinter implements DigitPrinter{
    @Override
    public void print(Digit[] digits) {
        for (Digit digit:digits){
            System.out.print(digit.getValue());
        }

    }
}
