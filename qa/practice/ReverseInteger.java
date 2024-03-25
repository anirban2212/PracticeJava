package qa.practice;

public class ReverseInteger {

    public static void main(String[]args){
        int i=1234;
        int rem=0,rev=0;
        while(i!=0){
            rem=i%10; //4 3 2 1
            rev=rev*10+rem; //4 43 432 4321
            i=i/10;//123 12 1 0
        }
        System.out.println(rev);
    }
}
