package hackerrank;

import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        String str=sc.nextLine();

        StringBuilder str1= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            str1.append(str.charAt(i));
        }

        if (str.equalsIgnoreCase(str1.toString())){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");

        }
    }


}
