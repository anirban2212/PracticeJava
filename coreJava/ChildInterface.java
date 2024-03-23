package coreJava;

public class ChildInterface implements ParentInterface{

    public static void main(String[] args) {
        /* I have created a object of the ChildInterface class to implemet
        methods of ParentInterface
        */

        ParentInterface p=new ChildInterface();
        ChildInterface c=new ChildInterface();

        p.green();
        p.red();
        c.yellow();
    }
    @Override
    public void red() {
        System.out.println("ddd");
    }

    @Override
    public void green() {
        System.out.println("djjkk");
    }

    public void yellow(){
        System.out.println("bjjnk");
    }
}
