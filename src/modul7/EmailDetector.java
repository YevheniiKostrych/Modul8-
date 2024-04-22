package modul7;

 class EmailDetector {
     public boolean isPresent(String text) {
         char[] chars = text.toCharArray();
         int indexOfDog = -1;
         boolean result = true;
         for (int i = 0; i < chars.length; i++) {
             if (chars[i] == '@') {
                 indexOfDog = i;
                 break;
             }
         }
         if (indexOfDog == -1 ||                 // Якщо символ '@' не знайдено
                 indexOfDog == 0 ||                  // Якщо '@' - перший символ
                 indexOfDog == chars.length - 1 ||   // Якщо '@' - останній символ
                 chars[indexOfDog - 1] == ' ' ||     // Якщо перед '@' є пробіл
                 chars[indexOfDog + 1] == ' ') {     // Якщо після '@' є пробіл
             result = false;
         }


         if ((chars[indexOfDog - 1] == ' ' || chars[indexOfDog - 2] == ' ' || chars[indexOfDog + 1] == ' ' || chars[indexOfDog + 2] == ' ') || (indexOfDog == 1 || indexOfDog == 0 || indexOfDog == 2 || indexOfDog == chars.length - 1 || indexOfDog == chars.length - 2 || indexOfDog == chars.length - 3)) {
             result = false;
         }
         return result;
     }
 }
class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}
