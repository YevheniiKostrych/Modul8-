package modul9.myLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList <String>myLinkedList=new MyLinkedList<>();
        myLinkedList.add("A");
        myLinkedList.add("B");
        myLinkedList.add("C");
        myLinkedList.add("D");
        myLinkedList.add("E");

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(2));
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
       myLinkedList.clear();
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList);






    }
}
