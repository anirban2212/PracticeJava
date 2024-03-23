package collection;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        /*
        Array list is dynamic in nature
        can accept duplicate value
        ArrayList, LL, vector - implements List interface
         */

        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(0);
        System.out.println(a);
        try {
            System.out.println(a.get(4));
        }



        catch (Exception e){
          System.out.println(e);
        }
        a.remove(2);

        System.out.println(a.contains(1));
        a.add(5,5);


    }

}
