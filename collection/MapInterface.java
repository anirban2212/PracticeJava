package collection;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        /*
        allows more than one null value
        allows duplicate

        hasmap          |      hashtable

        1.not synchronized  not thread safe ,  | supporst multithreading , thread safe
        multi threading not supported          |
``
        2.hasTable doesnot allow null value
        3. hashmap uses iterator , hastable uses enumarator to iterate the values
         */

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(0,"A");
        hm.put(1,"B");
        hm.put(2,"c");
        hm.put(3,"d");
        hm.put(33,null);
        hm.put(34," ");
        hm.put(44,null);
        hm.put(44,"A");

        hm.put(null,"anirban");
        hm.put(null,"anirban");

       /*
        System.out.println(hm.get(44));
        System.out.println(hm);
        */






       Set s= hm.entrySet();
       Iterator i=s.iterator();
       while(i.hasNext()){
           Map.Entry mp=(Map.Entry)i.next();
           System.out.println(mp.getKey()+" -> "+mp.getValue());
           }
       }


    }






