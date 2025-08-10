package Arrays_String.ArrayPdfQuestion;

public class SortedArrayOrNot {
    public static void main(String[] args) {

        //Q. Check if an array is sorted in ascending order.
        int [] arr={1,2,3,9,5};
        boolean sorted=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                sorted=false;
                break;
            }
        }
        if (sorted){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }

    }
}
