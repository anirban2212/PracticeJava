package qa.practice;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int arr[] = {33, 4, 50, -8, 0};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

    }
}
