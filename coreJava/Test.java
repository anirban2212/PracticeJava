package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public abstract class Test {

    public static void main(String[] args) {
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
        System.out.println(sdf.format(d));
        System.out.println(d.toString());


    }

}
