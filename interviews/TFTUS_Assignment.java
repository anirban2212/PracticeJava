package interviews;
import java.util.*;

/*
Write a program in which there should be a function
that accepts a string (your first name and last name, separated with space)
at runtime and the function returns a string in which only your first name
should be sorted in ascending order with proper formatting and capitalization.
 Eg: The user enters "Rahul Sharma" and the output should be "Ahlru Sharma"
Example Test Cases
Test Case 1
str: Rahul Sharma
Output: Ahlru Sharma

In this method:
Public static String solve(String str){

Write your code here
Return output;
}
 */

public class TFTUS_Assignment {

    public static void main(String[] args) {
        solve("Rahul Sharma");

/*
        String a="anirban nag";
        String[]b= a.split(" ");
        System.out.println(b[0]);
        System.out.println(b[1]);
*/

    }


    public static String solve(String str) {


        String []str1=str.split(" ");
        String firstName=str1[0];
        String lastName=str1[1];


        String lowerCase= firstName.toLowerCase();
        System.out.println(lowerCase);
        char[]c=lowerCase.toCharArray();

        Arrays.sort(c);
        String s=new String(c);
        System.out.println(s);





        String firstCharUpperCase = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println(firstCharUpperCase);







        String output =firstCharUpperCase+" "+lastName;
        System.out.println(output);
        return output;
    }
}



