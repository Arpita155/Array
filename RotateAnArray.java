package Array_Matrix_String.Array.ArrayPdfQuestion;
import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {

        //Approach -1       this approach is Brute force approach and   T.C--> O(k*n) S.C-->O(1)
        int [] a ={1,2,3,4,5,6,7,8};
        int p=2;
        for(int i=0;i<p;i++){
            int temp=a[a.length-1];
            for(int j=a.length-2;j>=0;j--){
                a[j+1]=a[j];
            }
            a[0]=temp;
        }
        System.out.println("Rotated array is: ");
        for(int num:a){
            System.out.print(num+" ");
        }


        //Approach-2      T.C -->O(n)  S.C-->O(n)
        /*int i;
        int j;
        int l=3;
        int [] nums={1,2,3,4,5,6,7};
        int temp[]= new int[nums.length];
        l%=nums.length;
        int tepmv=0;
        for(i=nums.length-l;i<nums.length;i++){
            temp[tepmv++]=nums[i];
        }
        for(i=0;i<(nums.length-l);i++){
            temp[tepmv++]=nums[i];
        }
        for(i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        System.out.print("\nRotated array is: ");
        for(int arr:nums){
            System.out.print(arr+" ");
        }
        */

        //Approach -3
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < i; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter how many times  you want to rotate the array:");
        int k = sc.nextInt();
        if (k > n) {
            k %= n;
        }
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int [] arr,int start,int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

}
