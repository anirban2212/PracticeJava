package qa.practice;

import java.util.*;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Test {

    public static void main(String[] args) {
    //duplicate();
       // max();
       // revWord();
        //revString();
      //  sortArray();
        //fibo();
        palindrom();


    }

    public static void duplicate(){
        String str="anirban";
        char [] ch=str.toCharArray();


        Map<Character,Integer> charMap=new HashMap<Character,Integer>();

        for(Character c:ch){
            if(charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }else{
                charMap.put(c,1);
            }
        }

        Set s=charMap.entrySet();

        Iterator i=s.iterator();
        while(i.hasNext()){
          Map.Entry map=(Map.Entry)i.next();
          if((Integer)map.getValue()>1) {

              System.out.println(map.getKey() + " " + map.getValue());
          }

        }    }
    public static void max(){
        int arr[]={1,2,3,4,5,6,7,100,101,400,-555,600,4,7};
        int max=Integer.MIN_VALUE; //-2^31
        int sMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++ ){
            if(arr[i]>max){
                sMax=max;
                max=arr[i];

            }else if(arr[i]>sMax &&arr[i]!=max){
                sMax=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(sMax);



    }
    public static void revWord(){

        String str="My name is anirban";
        String revStr="";
       String []str1=str.split(" ");
       for(int i=str1.length-1;i>=0;i--){
           revStr=revStr+str1[i]+" ";
       }
        System.out.println(revStr.trim());
    }

    public static void revString(){
        String str="anirban";
        char[]c=str.toCharArray();
        String rev="";
        for(int i=c.length-1;i>=0;i--){
            rev=rev+c[i];

        }
        System.out.println(rev);
    }

    public static void sortArray(){
        int []arr={44,6,1,8,99,100,-444};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }
            }
        }
        System.out.println("sorted array is "+ Arrays.toString(arr));

    }

    public static void  fibo(){
        int n1=0,n2=1,sum=0;
        System.out.println(n1);
        System.out.println(n2);

        for (int i=2;i<5;i++){
            sum=n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
        }

    }

    public static void palindrom(){
        int number =1234,rev=0;
        while(number!=0){
            int remainder=number%10;
            rev=rev*10+remainder;
            number=number/10;

        }
        System.out.println(rev);
        if(rev==number){
            System.out.println("palindrom");


        }
    else {
            System.out.println("not palindrom" +
                    "");
        }
    }

}
