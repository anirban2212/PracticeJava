package interviews;

import java.util.*;

public class ZopSmart {
    int i;
    int a;



    public static void main(String[] args) throws ArithmeticException{
       int[]arr={1,2,3,3,40,40,9,10};
       //output : 1,2,3,40,9,10

        Map<Integer,Integer>map=new HashMap<>();

        for(Integer i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }

        Set s=map.entrySet();
       // System.out.println(s);

        Set<Integer>si=new LinkedHashSet<>();
        si.add(2);
        si.add(33);
        si.add(1);
        System.out.println(si);
        /*
        Iterator i1=si.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());

        }*/
        try{
            int i =10/0;
        }
        catch (Exception e){
            System.out.println(e);
        }finally {
            //set of code must run
        }


        Iterator i=s.iterator();
        while(i.hasNext()){
            Map.Entry m=(Map.Entry)i.next();

            System.out.println(m.getKey());
        }


    }

}
