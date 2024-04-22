package modul3;

import java.util.Arrays;
class HarekDataMaker{
    public String aggregateSingle(String name, String age, String planet){
        String string="name - "+name+", age - "+ age+", planet - "+planet;
        return string;
    }
    public String[] aggregateAll(String[] names, int[] ages, String[] planets){
        String[]result=new String[3];
        for (int i = 0; i < result.length; i++) {
           result[i]=aggregateSingle(names[i],Integer.toString(ages[i]),planets[i]);

        }

        return result;
    }



}
