package qa.practice;

public class StringRev {

    public static void main(String[] args) {
        String str="Anirban";


        char[] c=str.toCharArray();
        String str1="";
        String str2="";

        for(int i=c.length-1;i>=0;i--){
            str1=str1+c[i];

        }
        for (int i=str.length()-1;i>=0;i--){
            str2=str2+str.charAt(i);
        }

        System.out.println(str1);
        System.out.println(str2);

        String s="SELENIUM";
        //String buffer in mutable object

        StringBuffer sf=new StringBuffer(s);
        System.out.println(sf.reverse());




    }
}
