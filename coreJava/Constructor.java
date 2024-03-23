package coreJava;

public class Constructor {

    public Constructor(){
        System.out.println("abcd");
    }
    public Constructor(int a, int b){
        System.out.println("parameterrize constructor");
    }

    public static void main(String[] args) {
        Constructor c=new Constructor(1,2);
        Constructor cd=new Constructor();
       // c.leave();

      //  c.Constructor(1,2);
    }

    public void leave(){
        System.out.println("i am in leave");
    }
}
