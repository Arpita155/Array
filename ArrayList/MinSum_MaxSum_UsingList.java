package Array_Matrix_String.Array.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MinSum_MaxSum_UsingList {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long maxSum = 0;
        long minSum = 0;
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++){
            minSum += arr.get(i);
        }
        for(int i=1;i<arr.size();i++){
            maxSum += arr.get(i);
        }
        System.out.print(minSum+" "+maxSum);
    }

    public static void main(String[] args) {
        List<Integer> sum = new ArrayList<>();
        sum.add(1);
        sum.add(2);
        sum.add(11);
        sum.add(3);
        sum.add(10);
        sum.add(4);
        miniMaxSum(sum);  // 20 30
    }
}
