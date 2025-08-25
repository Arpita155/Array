//Find the frequency of a given element in an array.
public class Frequency{
  public static void main(String[] args){

        int []arr={1,2,3,2,4,2};
        int target=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("the frequency of "+target+" : "+count);
  }
}
