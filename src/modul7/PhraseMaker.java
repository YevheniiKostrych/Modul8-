package modul7;

class PhraseMaker {
    public String join(String[] words) {

        StringBuilder stringBuilder=new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                stringBuilder.append(word.toUpperCase());
            } else {
                stringBuilder.append(word.toLowerCase());



        }stringBuilder.append(' ');

    }
        return stringBuilder.toString().trim();
}}

 class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }
}