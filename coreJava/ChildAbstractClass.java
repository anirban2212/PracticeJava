package coreJava;

public class ChildAbstractClass extends ParentAbstractClass{
    /*
    this class has followed all the guildline by its parent company and it has its own implementation of the
    method body
     */

    public static void main(String[] args) {
        ChildAbstractClass c=new ChildAbstractClass();
        c.color();
        // we can not create object of the abtract class
        //ParentAbstractClass p=new ParentAbstractClass();
    }

    @Override
    public void color() {

    }
}
