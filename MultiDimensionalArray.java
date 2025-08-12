package Array_Matrix_String.Array;

import java.util.Arrays;
public class MultiDimensionalArray {
    public static void main(String[] args){

        int [] a={1,2,3};
        int [] b={4,5,6};   // Array declaration and initialization

        //Traversal of 1- D Array
        System.out.println("Elements of 1-D array: ");
        int [] c={1,2,3,4,5};
        for(int i:c){
            System.out.print(i+" ");  // 1 2 3 4 5
        }



        // Traversal of 2-D arrays :
        //Array of arrays :
        int [][] p={a,b};
        int [] [] q={
                {1,2,3,4},
                {5,6,7,8}
        };

        System.out.println("\nits show the address of the {5,6,7,8} matrix: "+q[1]);   // its show the address of the {5,6,7,8} matrix
        System.out.println("Element at the position q[0][0] is: "+q[0][0]);  // this is use for finding a particular element in the matrix   OUTPUT: 1

        System.out.println("Traversing 2- D arrays");
        System.out.println("Approach 1");
        for(int [] i:q){
            System.out.println(Arrays.toString(i));   //[1, 2, 3, 4] [5, 6, 7, 8]
        }

        System.out.println("Approach 2");
        for(int i=0;i<q.length;i++){
            for(int j=0;j<q[i].length;j++){
                System.out.print(q[i][j] + " ");
            }
            System.out.println();
        }


        // Traversal of 3-D Arrays :
        int [][][] e = {
                { {1,2,3},{4,5,6} },
                { {7,8,9},{10,11,12} },
                { {13,14,15},{16,17,18} }
        };

        System.out.println("\n3-D array is: ");
        for(int i=0;i<e.length;i++){
            for(int j=0;j<e[i].length;j++){
                System.out.print("[");
                for(int k=0;k<e[i][j].length;k++){
                    System.out.print(e[i][j][k] + " ");
                }
                System.out.print("]");
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.println("Element of 3-D array at the index e[1][0][1] is: "+e[1][0][1]);  // 8  this is use for finding a particular element in the matrix


    }
}
