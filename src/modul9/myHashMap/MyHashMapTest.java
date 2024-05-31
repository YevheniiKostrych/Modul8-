package modul9.myHashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String,String> myHashMap=new MyHashMap<>();
        myHashMap.put("Hi","Petro");
        myHashMap.put("Hello","Sem");
        myHashMap.put("Morning","Vasya");
        System.out.println(myHashMap);
        System.out.println(myHashMap.get("Hello"));
        System.out.println(myHashMap.size());
       myHashMap.remove("Hello");
        System.out.println(myHashMap);
    }
}
