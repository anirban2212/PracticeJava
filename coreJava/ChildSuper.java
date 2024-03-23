package coreJava;

public class ChildSuper extends ParentSuper{
    public ChildSuper(){
        super();
        System.out.println("child class constructor");
    }

    String name="Bublu";
    public void getData(){
       // super.getData();
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        ChildSuper c=new ChildSuper();
        c.getData();

    }
}
