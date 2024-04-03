package interviews;

/*
Adding one to number represented as array of digits (without using ArrayList, Map, List)

Input 1: [1, 2, 4] -> int []input1 = {1,2,4};
Output 1: [1, 2, 5]

Input 2: [0,0,2] -> int []input2 = {0, 0, 2};
Output 2: [0,0,3]

Input 3: [9,9] -> int []input3 = {9, 9};
Output 3: [1,0,0]

Explanation:
Input 1 - [1,2,4] -> 124 -> (124 + 1) -> 125 -> [1,2,5]

Input 2 - [0,0,2] -> 002 -> (002 + 1) -> 003 -> [0,0,3]

Input 3 - [9,9] -> 99 -> (99 + 1) -> 100 -> [1,0,0]
*/






import java.util.Arrays;

public class JungleeGaming {


    public static void main(String[] args) {
        int []arr={9,9};



        int length=arr.length;

        int no=0;
        for(int i=0;i<arr.length;i++){
            no=no*10+arr[i];
        }
        System.out.println(no);

        int newNo=no+1;
        System.out.println(newNo);

    int count=0;



    int copyOfNewNo=newNo;
        while (copyOfNewNo!=0){
            copyOfNewNo=copyOfNewNo/10;
            count=count+1;
        }
        System.out.println("count :"+count);

      //  int []noArr={0,0,0};

        int newLength=count>length?count:length;
        int noArr[]=new int[newLength];


        int remainder;


        while(newNo!=0){


            remainder= newNo % 10;
            newNo=newNo/10;
           // System.out.println("remainder value : "+remainder);

            //if(remainder)
            noArr[newLength-1]=remainder;
            newLength--;
/*
           for(int i=length-1;i>=0;i--){
               noArr[i]=remainder;
               System.out.println(noArr[i]);
           }
           */






        }

      System.out.println("Arrsy is: "+Arrays.toString(noArr));




    }


}
/*
@Test(dayaprovide="")
public void validateMethod(String scenario,Int i){
    setu
            if(scenario.euqas("f0r 0-10")){
                verfy something
            }else if (scenario.equas(10-99)){
                verufy
            }

}
@DataProvider(name="",parallel=true)
public Object[][]getData(){
    return new Object[][]{
            {"f0r 0-10", 5},
            {"10-9910-99",99},
            {"100-999",100}
    };
}

<suite dataprovider-thread-ount=3>
<test>*/