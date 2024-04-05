package interviews;

public class Test {


        public static void main(String[] args) {
           /* String originalString = "anirban nag";

            String s=originalString.substring(0,1).toUpperCase()+originalString.substring(1).toLowerCase();
            System.out.println(s);

            String str="abbbaa";

            Boolean flag=true;
            int left=0;
            int right=str.length()-1;
            while(left<right){
                if(str.charAt(left)!=str.charAt(right)){
                    flag=false;

                }
                left++;
                right--;

            }

            if(flag){
                System.out.println("palindrom");

            }
            else {
                System.out.println("not palindrom");
            }

            */

            int no=1234,remainder,revNo=0;
            while(no!=0){
                remainder=no%10;
                revNo=revNo*10+remainder;
                no=no/10;

            }
            System.out.println(revNo);}
    }

