package qa.practice;

public class SlargSminArray {

    public static void main(String[] args) {
    sMax();
    sMin();
    }

    public static void sMax(){
        int arr[]={4,1,3,88,99,100,19999,5,44,6,-100,101,-444,555};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            } else if (arr[i]>smax && arr[i]!=max) {
                smax=arr[i];
            }
        }
        System.out.println(" max"+max);
        System.out.println("second max"+ smax);

    }

    public static void sMin(){

        int arr[]={4,1,3,88,99,100,19999,5,44,6,-100,101,-555};

        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if(arr[i]<smin && arr[i]!=min){
                smin=arr[i];

            }
        }

        System.out.println(" min"+ min);
        System.out.println("second min"+ smin);

    }
}
