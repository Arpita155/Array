package Array_Matrix_String.Array.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Thief_Problem {

    // You are given an integer array arr[]. The elements of array represent the value of items. You are also given an integer k.
    // Now, a thief wants to commit a burglary, but he can only pick k items from the given items.
    // Help him so that he gets the maximum total value out of this theft.

    public int getMaxVal(List<Integer> arr, int k) {
        // code here
        int total = 0;
        Collections.sort(arr);
        int n = arr.size();
        for(int i=n-k;i<n;i++){
            total += arr.get(i);
        }
        return total;
    }

    public static void main(String[] args) {

        List<Integer> mylist = Arrays.asList(1,5,2,3,7,4,8);
        Thief_Problem obj = new Thief_Problem();
        int result = obj.getMaxVal(mylist,3);
        System.out.println("The thief gets the maximum total value = "+result);
    }
}
