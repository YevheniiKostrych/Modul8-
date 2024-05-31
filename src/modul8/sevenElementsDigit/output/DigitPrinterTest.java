package modul8.sevenElementsDigit.output;

import modul8.sevenElementsDigit.Digit;

public class DigitPrinterTest {
    public static void main(String[] args) {
DigitPrinter printer=new SevenElementDigitPrinter();
Digit[]digits={
        Digit.one,

        Digit.five,

        Digit.six};

printer.print(digits);

    }
}
