package modul8.test;

public class ShowSomeThing {
    public ShowSomeThing(String s) {
        char[] strings = s.toCharArray();


        StringBuilder st = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            st.append(strings[i]);
            st.append("  ");
        }
        System.out.println(st);
    }

    public static void main(String[] args) {
        ShowSomeThing showSomeThing=new ShowSomeThing("Alina Mazur");
    }

}
