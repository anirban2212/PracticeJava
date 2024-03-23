package coreJava;

public class StaticVar {
    //instance variable
    String name;
    String adress;
     int i=0;
   static String city="Kolkata";
    StaticVar(String n, String a){

        //these
        this.name=n;
        this.adress=a;
        i++;
        System.out.println(++i);

    }
    public void getData(){
        System.out.println(name+" "+adress+" "+ city);
    }

    public static void main(String[] args) {
        StaticVar s=new StaticVar("bublu","dhakuriya");
        StaticVar s1=new StaticVar("anirban","hooghly");
        s1.getData();
        s.getData();
    }
}
