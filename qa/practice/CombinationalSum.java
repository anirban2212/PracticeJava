package qa.practice;

import java.util.ArrayList;
import java.util.*;

public class CombinationalSum {
    public static void main(String[] args) {
        // reverseStringOnlyAlphabet();
        //  stringReversePreserveSpace();
        //  test1();
        //test2();

        test3();


    }

    public static void test3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no:");
        int n = sc.nextInt(), fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
    }

    public static void test2() {

        int[] arr = {0, 0, 1, 1, 0, 0, 1};
        Arrays.sort(arr);
        /// System.out.println(Arrays.toString(arr));
        int i = 1, j = 2;

        i = i + j;//3
        j = i - j;//1
        i = i - j;


        System.out.println(i + " " + j);
    }

    public static void reverseStringOnlyAlphabet() {
        String str = "My id is 1234";
        str = str.replaceAll("[0-9]", "");
        String rev = "";
        System.out.println(str);
        String[] str1 = str.split(" ");
        for (int i = str1.length - 1; i >= 0; i--) {
            rev = rev + str1[i] + " ";
        }
        System.out.println(rev.trim());

    }

    public static void test1() {
        String str = "I am boy";
        char[] c = str.toCharArray();
        int left = 0;
        int right = c.length - 1;
        while (left < right) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;

        }
        String str1 = new String(c);
        System.out.println(str1);

    }

    public static void stringReversePreserveSpace() {
        String str = "I am boy";
        System.out.println(str);
        char[] ch = str.toCharArray();
        int index = -1;
        ArrayList<Integer> al = new ArrayList();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                al.add(i);
            }
        }

        System.out.println(al);

        str = str.replaceAll(" ", "");
        System.out.println(str);
        String rev = "";

        char[] charray = str.toCharArray();
        for (int i = charray.length - 1; i >= 0; i--) {


            rev = rev + charray[i];

        }

        System.out.println(rev);
        String newString = "";

        char[] c = rev.toCharArray();
        int size = c.length;

        for (int i = 0; i < size; i++) {
            if (al.contains(i)) {
                newString = newString + " " + c[i];


            } else {
                newString = newString + c[i];


            }
        }
        System.out.println(newString);

    }


}
