package Array_Matrix_String.Array.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArraySumUsingList {

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum =0;
        for(int i=0;i<ar.size();i++){
            sum += ar.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(10);
        myNumbers.add(11);
        int result = simpleArraySum(myNumbers);
        System.out.println("sum of the arraylist = "+result);   // 31
    }
}
