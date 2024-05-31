package modul9.myArrayList;



public  class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(3);
        myArrayList.add(2);
        myArrayList.add("hj");
        myArrayList.remove(2);
        System.out.println(myArrayList);
        myArrayList.clear();
        System.out.println("MyArrayList: "+myArrayList);


    }
}
