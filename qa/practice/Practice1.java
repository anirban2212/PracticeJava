package qa.practice;
import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
    //test1();
        //test2();
       // test3();
       // test4();
       // test5();
        //test6();
        test7();

    }

    public static void test7(){
        String str="java";
        char[]c=str.toCharArray();
        Map<Character,Integer>map=new HashMap();

        for(Character ch:c){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);

            }
        }

        Set s=map.entrySet();
        Iterator i=s.iterator();
        while(i.hasNext()){
            Map.Entry mp=(Map.Entry)i.next();

            if((Integer)mp.getValue()>1){
                System.out.println(mp.getKey()+" "+mp.getValue());
            }
        }


    }    public static void test6(){
        String str="abcd1234efgh";
        str=str.replaceAll("[^0-9]","");
        System.out.println(str);


    }

    public static void test5(){
        int arr[]={33,44,-100,99,0,-3,555};
/*
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        */

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void test4(){
        int fact=1;
        for(int i=1;i<=4;i++){
            fact=fact*i;

        }
        System.out.println(fact);
    }
    public static void test3(){
        int n1=0,n2=1,sum=0;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<10;i++){
            sum=n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;

        }

    }
    public static void test2(){
        String str="My name is Anirban";
        String rev="";
        String []str1=str.split(" ");
        for(int i=str1.length-1;i>=0;i--){
            rev=rev+str1[i]+" ";
        }
        System.out.println(rev.trim());

    }


    public static void test1(){
        String str="My name is anirban";
        char[]c=str.toCharArray();
        String rev="";
        for(int i=c.length-1;i>=0;i--){
            rev=rev+c[i];
        }
        System.out.println(rev);
    }
}
