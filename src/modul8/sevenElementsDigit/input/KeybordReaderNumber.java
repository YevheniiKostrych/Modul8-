package modul8.sevenElementsDigit.input;

import java.util.Scanner;

public class KeybordReaderNumber implements KeybordReader {
    @Override
    public int number() {
        Scanner scan=new Scanner(System.in);
        int i= scan.nextInt();
        scan.close();
        return i;
    }
}