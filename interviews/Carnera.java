package interviews;

import java.util.Arrays;

public class Carnera {
    /*
    Find the first non-repeating character from a string
     */

    public static void main(String[] args) {
        String str = "mammi";
        char[] c = str.toCharArray();


       int count=0;

        for (int i = 0; i <= c.length - 1; i++) {
            for (int j = i+1; j <= str.length() - 1; j++) {
                if (c[i] == str.charAt(j)) {

                    count++;

                }
            }
            if(count==0){
                System.out.println("First non repeated character is: "+c[i] );
                break;

            } else if (count>=1) {
                System.out.println("multieple time present:"+c[i]);
                count=0;

            }
        }

    }
}
