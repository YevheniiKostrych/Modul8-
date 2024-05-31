package modul8.sevenElementsDigit.input;

public class StringNumberReader implements KeybordReader{
    private int line;
    public StringNumberReader(int line){
        this.line= line;

    }

    @Override
    public int number() {
        return line;
    }
}
