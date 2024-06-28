package modul10.task1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberOutputStream {
    public static void main(String[] args) {
        File file = new File("file.txt");
        file.getPath();
        readFileAndPrint(file);
    }public static void readFileAndPrint(File file) {
            Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
            Pattern pattern1 = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}");

            try (BufferedReader br =new BufferedReader(new FileReader(file))){
                String string;
                while ((string = br.readLine()) != null){

                    Matcher matcher = pattern.matcher(string);
                    Matcher matcher1 = pattern1.matcher(string);

                    if (matcher.matches() || matcher1.matches()) {
                        System.out.println(string);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
}