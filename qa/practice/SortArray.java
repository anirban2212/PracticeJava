package qa.practice;

import java.util.Arrays;

public class SortArray {



    public static void main(String[]args){
        main();

    }
    public static void main(){
        int arr[]={4,1,3,88,99,100,19999,5,44,6,-100,101,-555};

        System.out.println("Before sorting: "+ Arrays.toString(arr));

        for(int i=0;i<arr.length-1;i++){ //how many times
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){ // check each nd every
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("after sorting :" +Arrays.toString(arr));

    }
}
