package qa.practice;

public class Abc {
    public static void main(String[] args) {

    String str1="abc123def";
    String str2="abc123def";
    String str3=new String("abc123def");

    System.out.println(str1==str2);
        System.out.println(str2==str3);
        /*
        str1 and str2 refer to the same string object in the string pool because they are initialized with the same string literal.
str3 refers to a different string object created explicitly with the new keyword, regardless of the content being the same.
         */





    }
    public static void main(){
        System.out.println("bublu");
    }
}
