package qa.practice;

public class WordRevString {

    public static void main(String[] args) {
        String str="my name is anirban";
        String revStr="";

        String[]str1=str.split(" ");
       // System.out.println(str1[3]);
       for(int i=str1.length-1;i>=0;i--)
       {
           revStr=revStr+str1[i]+" ";
       }

        System.out.println(revStr.trim());


    }
}
