package qa.practice;

import java.util.*;

public class StringPalindrom {
    public static void main(String[] args) {
        String str="abcd";



       /* String str = "a";
        *//*if (str.length() == 1 || str.length() == 0) {
            System.out.println("can not calculet");

        } *//* if (ispalin(str)) {
            System.out.println("is palindrom");
        } else{
            System.out.println("not palindrom");
        }
*/
    }

    public static boolean ispalin(String str) {
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }

            left++;
            right--;

        }
        return true;
    }

}
