package modul9.myArrayList;


import java.util.AbstractList;
import java.util.ArrayList;

public  class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList=new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(1);
        myArrayList.add(1);
        myArrayList.add(1);
        myArrayList.add(1);
        myArrayList.add(1);
        myArrayList.add(1);
        myArrayList.add(null);
        myArrayList.add(null);
        myArrayList.add(1);
        myArrayList.add(1);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());




    }
}
