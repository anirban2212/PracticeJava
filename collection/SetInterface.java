package collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterface {
    /*
    HashSet, treeset, Linkedhashset -implements set interface
    does not accept duplicate values


    example: add the same item in a cart twice - arraylist
        recharge two times gives duplicate error message- hashset


        no gurentee that elements stored in sequential order - random order


     */
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();

        System.out.println(hs.size());
        hs.add("india");
        hs.add("uk");
        hs.add("usa");
        hs.add("usa");
        System.out.println(hs);

        Iterator<String> i=hs.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }







}
