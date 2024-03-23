package coreJava;

public abstract class ParentAbstractClass {

    /*access modifier : public protected, default ,
    can not have private- because child wont be able to use it

     Class can have normal methods (saftyguideline,parentaircraft)+ abstract methods  (color)


    */


    /*
    Interface vs abstract class:
    1.In terface can have only undecleard methods
    2. access modifies allowed in interface must be public
    3.variable defined must be public static final
    4.we use implements keyword

    abstract:
    1.methods: bastract+non bstract
    2.except private it can have any access modifier
    3.we user extends keyword

     */

    public void engine(){

    }
    public void licnnce(){

    }
    public abstract void color();
}
