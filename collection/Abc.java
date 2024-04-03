package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Abc {
    static String College="Academy of technology";

    String name="bublu";
    int roll=1;
Abc(){}
    Abc(String name, int roll,String College){

    this.name=name;
    this.roll=roll;
  //  this.College=College;
      //  System.out.println(name);
//System.out.println(roll);
  //      System.out.println(College);
    }
    public  void getStudentData(){
        System.out.println(name+" "+roll+" "+ College);

    }    public static void main(String[] args) {
    Abc b=new Abc();
    Abc a=new Abc("anirban",124,"jnu");
    b.getStudentData();
   a.getStudentData();




}





    public static void main(int[] args) {
        System.out.println("world");
    }
}
