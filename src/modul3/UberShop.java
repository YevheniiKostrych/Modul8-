package modul3;

import java.util.Arrays;

public class UberShop {
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks){

      String [] stringsResults = new String[showcaseStocks.length+warehouseStocks.length];
      if (showcaseStocks.length==0&&warehouseStocks.length==0){
          stringsResults=new String[0];
      }else {
        for (int i = 0; i < showcaseStocks.length; i++) {
            stringsResults[i]=showcaseStocks[i];


        }
        for (int i = 0; i < warehouseStocks.length; i++) {
          stringsResults[showcaseStocks.length+i]=warehouseStocks[i];
        }}
        return stringsResults;
    }




    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Final result should be ["gun", "firebow", "firegun"]
        String[] showcaseStocks = new String[] {"gun", "firebow"};
        String[] warehouseStocks = new String[] {"firegun"};
        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));
    }
}