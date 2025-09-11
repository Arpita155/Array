package Arrays_String.ArrayPdfQuestion;
import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {

        //Q. Find the second largest element in an array.
        //Approach -1  ---> it is much better because time complexity is less O(n)
        int []arr ={8,1,2,9,3,6,4,7,6,10};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2 && arr[i]<max1){
                max2=arr[i];
            }
        }
        System.out.print("The array is: ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println("\nsecond largest element in the array = "+max2);

        //Approach -2
        /*int []arr ={8,1,2,9,3,6,4,7,6,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
        */
        
        //Approach -3 --->the time complexity of this approach is O(n^2)
        /*int []arr ={8,1,2,9,3,6,4,7,6,10,11,1,4,12,10};
        int t;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.print("The array is: ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println("\nsecond largest element of the array = "+(arr[arr.length-2]));
        */
    }
}




