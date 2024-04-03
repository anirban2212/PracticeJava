package qa.practice;

import java.util.*;

public class RemoveDuplicateFromStringArray {
    public static void main(String[] args) {
        test2();

    }
    public static void test2(){
        String[]str={"a","b","b","c"};
        String str1="";

        for(int i=0;i<str.length;i++){
            if(!str1.contains(str[i])){
                str1=str1+str[i];
            }

        }
        System.out.println(str1);
        System.out.println(str1.toCharArray());

    }
    public static void test1(){
        String[] str = {"a", "b", "c", "d", "c"};

        Map<String, Integer> map = new HashMap();
        for (String s : str) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);

            }
        }

        Set s = map.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Map.Entry mp = (Map.Entry) it.next();
            if ((Integer) mp.getValue() <=1) {

                System.out.println(mp.getKey() + " " + mp.getValue());


            }
        }

    }


}
