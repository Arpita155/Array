package Array_Matrix_String.Array.ArrayPdfQuestion;

public class ReverseAnArray {
    public static void main(String[] args) {

        //Q3. Reverse an array in place.
        int []a={1,2,3,4,5};
        int n=a.length;
        System.out.println("original array");
        for(int i:a){
            System.out.print(i+" ");
        }
        for(int i=0;i<n/2;i++){
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        System.out.print("\nReversed array: ");
        for(int i:a){
            System.out.print(i+" ");
        }


        //Reverse the array Using another array.
        int []arr={1,2,3,4,5};
        int []temp=new int [arr.length];
        int tempv=0;
        for(int i=arr.length-1;i>=0;i--){
            temp[tempv++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        System.out.print("\nReverse the array using another array: ");
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}
