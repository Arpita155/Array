package Array_Matrix_String.Array.ArrayList;

import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {

        // Example 1:
        System.out.println("Example-1");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("guava");

        System.out.println("The Arraylist is: "+fruits);
        if (fruits.contains("mango")) {
            System.out.println("Mango is present in the list");
        }else {
            System.out.println("Mango is not present in the list");
        }


        // Example 2:
        System.out.println("Example-2");
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        System.out.println("The arraylist is: "+number);
        if(number.contains(8)){
            System.out.println("4 is present ");
        }else {
            System.out.println("4 is not present in the list");
        }

    }
}
