package modul7;

import static java.lang.Character.isLowerCase;

class NameCounter {
    public int count(String text){
        int count=0;
   char []chars =text.toCharArray();

        for (int i = 0; i < chars.length-1; i++) {
            if ((Character.isUpperCase(chars[i])&&Character.isLowerCase(chars[i+1])&&i>=0)||(Character.isUpperCase(chars[i])&&i==0&&Character.isLowerCase(chars[i+1]))) {

                count++;
            }


        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new NameCounter().count("Fo jjj Jjjj"));
    }
}
