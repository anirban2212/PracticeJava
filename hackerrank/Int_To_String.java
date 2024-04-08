package hackerrank;

import java.util.Scanner;

public class Int_To_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String s = String.valueOf(n);

        // Checking if the conversion is correct
        if (s.equals(Integer.toString(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

    }
}
