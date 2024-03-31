package qa.practice;

import java.util.Arrays;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {
        String str="abbcdefg";
        char[]c=str.toCharArray();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }

}
