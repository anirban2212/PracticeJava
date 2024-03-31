package collection;
import java.util.*;

public class Test {

    public static int ArrayChallenge(int[] arr) {
        Arrays.sort(arr);
        int sum=0;
        int n=arr.length-1;

        for(int i=n;i>n-4;i--){
            sum=sum+arr[i];

        }
        return sum;

    }

    public static void main (String[] args) {
     //  palindrom();
        duplicate();
       // duplicateed();


    }

    public static void duplicateed(){

        int arr[]={1,2,4,5,5,5,6,8,9,10,10};

        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(Integer i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);

            }else{
                map.put(i,1);
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

    }
    public static void duplicate(){
        String str="anirban is my name is anirban";

        //int arr[]={1,2,3,3,3,4,4,5,6,7};

       String []c=str.split(" ");
        Map<String,Integer> map=new HashMap<String,Integer>();

        for(String ch:c){
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
                System.out.println(mp.getValue()+"   "+mp.getKey());
            }


        }    }
    public static void palindrom(){
        int number=1234,rev=0,reminder=0;
        while(number!=0){
            reminder=number%10;
            rev=rev*10+reminder;
            number=number/10;

        }
        if(rev==number){

        }
        System.out.println(rev);
    }


}
