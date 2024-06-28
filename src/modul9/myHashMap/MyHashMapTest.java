package modul9.myHashMap;

import java.util.HashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String,String> myHashMap=new MyHashMap<>();
        myHashMap.put("Hi","Petro");
        myHashMap.put(null,"Sem");
        myHashMap.put("Morning","Vasya");
        System.out.println(myHashMap);

      System.out.println(myHashMap.size());
      myHashMap.remove(null);
        myHashMap.put(null,"Sessssssm");
        System.out.println(myHashMap);
        System.out.println(myHashMap.size());
        System.out.println(myHashMap.get(null));

    }
}
