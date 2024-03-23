package qa.practice;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        //fibo();
        maxMinArray();
    }

   // 0 1 1 2 3 5

    public static void fibo() {
        int n1 = 0, n2 = 1, sum=0;
        System.out.println(n1);
        System.out.println(n2);

        for(int i=2;i<5;i++){
            sum =n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
        }

    }
    public static void maxMinArray(){

        int []arr={4,3,6,11,99,8,12,3};

        /*
       Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        */
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);



    }
}
