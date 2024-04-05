package interviews;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ey {


    /*
    driver.switchTo().alert().dismiss();

djkdjkdk


swithTo(){
js
dd
dkd
}

David , 95
Jane, 80
Mary , 32
Lisa , 21
Phil , 55


Map<String,Integer>mp=new HashMap();

map.put(“David , 95);
map.put();
map.put();
map.put();
map.put();


1 2 3 4 5 6 
2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 


for(int i=1;i<=6;i++){
for(int j =i;j<=6;j++){

sout(j);


}
sout();
}

1 2 3 4 5 6
23456
3456

List<weblem>li=findeelements,

li.hge


driver.findElemnt(By.xpath(“file”)).sendkeys(“path”);



feature=“.feature”,
glue=“stefdefination”,


.xml

70



suite>.fet

@


Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5


import java.util.*;

int []arr={-12, 11, -13, -5, 6, -7, 5, -3, -6}

for(int i=0;i<arr.length;i++){
	for(j=0;i<arr.length;j++){
		if(arr[j]>arr[j+1]){
		int temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
}
}

sout(Arrays.toString(arr));

5,10,23,442,10,12,23
output : 10,23



int [] arr={5,10,23,442,10,12,23};

5 1
10 2

Map<Integer,Integer>map=new HashMap<>();

for(Integer i:arr){
	if(map.containsKey(i)){
	map.put(i,map.get(i)+1);
	else{
	map.put(i,1);
}
Set s=map.EntrySet();
Iterator i=s.iterator();

while(i.hasNext()){

	Map.Entry m=(Map.Entry)i.next;

	if((Integer)m.getValue>1){
	sout(“repeated values are”+m.getKey()+ “repeated ”+ m.getValue() +”times”);
}

}

}

+“label”+










     */


    public static void main(String[] args) {
    //pattern();
        sortArray();



    }

    public static void pattern(){
        int rows = 6;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop for spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Inner loop for numbers
            for (int k = i; k <= rows; k++) {
                System.out.print(k+ " ");
            }

            // Move to the next line after each row
            System.out.println();
        }

    }

    public static void sortArray() {

        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int length=arr.length-1;

        for (int i = 0; i<length; i++) {
            for (int j = 0; j<length; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(arr));

    }

}


