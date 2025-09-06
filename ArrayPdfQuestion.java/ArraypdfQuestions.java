package Array_Matrix_String.Array.ArrayPdfQuestion;

public class ArraypdfQuestions {
    public static void main(String[] args) {

        //Q1. Given an array of integers , find the sum of all elements.
        /*int []a={1,2,3,4,5};
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        System.out.println("sum of all elements in the given array= "+sum);
         */

        //Q2. Find the maximum and minimum elements in an array.
        /*int []arr={10,5,20,8,15};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum element= "+max);
        System.out.println("Minimum elements= "+min);
        */

        //Q3. Reverse an array in place.
        /*int []arr={1,2,3,4,5};
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for(int i:arr){
            System.out.print(i);
        }
        */

        //Reverse an array Using another array
        /*int []arr={1,2,3,4,5};
        int []temp=new int [arr.length];
        int tempv=0;
        for(int i=arr.length-1;i>=0;i--){
            temp[tempv++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        for(int num:arr){
            System.out.print(num);
        }
        */

        //Q4. Check if an array contains a given element.
        /*int [] arr={10,20,30,40,50};
        int target=30;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("the element "+ target+" is found");
        }else{
            System.out.println("the element "+ target+" is not found");
        }
         */

        //Q5. Find the frequency of a given element in an array.
        /*int []arr={1,2,3,2,4,2};
        int target=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("the frequency of "+target+" : "+count);
         */

        //Q6. Sort an array in ascending order using bubble sort.
        /*int []arr ={8,1,2,9,3,6,4,7,6};
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
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
         */

        //Q7. Find the second largest element in an array.
        //Approach -1  ---> it is much better because time complexity is less O(n)
        /*int []arr ={8,1,2,9,3,6,4,7,6,10};
        int max1=arr[0];
        int max2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println("second largest element in the array= "+max2);
        */

        //Approach -2 --->the time complexity of this approach is O(n^2)
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
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println("second largest element of the array = "+(arr[arr.length-2]));
        */

        //Q8. Check if an array is sorted in ascending order.
        /*int [] arr={1,2,3,4,5};
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
        */

        //Q9. Find the missing number in an array of consecutive integers. Given an array arr[] of size N-1 with integers in the range [1,N],
        // the task is to find the missing number from the first N integers.
        /*int []arr = {1,2,3,5};
        int n = arr.length+1;
        int expectedSum = n*(n+1)/2;
        int totalsum=0;
        for(int num:arr){
            totalsum+=num;
        }
        int missingNumber=expectedSum-totalsum;
        System.out.println("the missing number of the array = "+missingNumber);
        */

        //Q10. Rotate an array by k position to the right.
        //Approach -1        this approach is Brute force approach and   T.C--> O(k*n) S.C-->O(1)
        /*int [] arr = {1,2,3,4,5,6,7,8};
        int k=2;
        for(int i=0;i<k;i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-2;j>=0;j--){
                arr[j+1]=arr[j];
            }
            arr[0]=temp;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        */

        //Approach-2      T.C -->O(n)  S.C-->O(n)
        /*int i;
        int j;
        int k=3;
        int [] nums={1,2,3,4,5,6,7};
        int temp[]= new int[nums.length];
        k%=nums.length;
        int tepmv=0;
        for(i=nums.length-k;i<nums.length;i++){
            temp[tepmv++]=nums[i];
        }
        for(i=0;i<(nums.length-k);i++){
            temp[tepmv++]=nums[i];
        }
        for(i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        for(int arr:nums){
            System.out.print(arr);
        }
         */

        //Approach -3
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
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
         */


    }
}