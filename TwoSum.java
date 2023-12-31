import java.util.*;

public class TwoSum{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: "); //User provide the array size
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize]; //initilizing array
        for(int i=0; i<arraySize;i++){
            System.out.print("Enter your "+i+" element of array: "); //User provinding array
            array[i] = scanner.nextInt();
        }
        System.out.print("You want the sum of: "); // Target, the sum of two
        int target = scanner.nextInt();
        boolean isFound = false; //used to check if we found the sum or not
        for(int i=0;i<arraySize-1;i++){
            for(int j=i+1;j<arraySize;j++){
                if(target == array[i]+array[i+1]){
                    System.out.println("The number is found on the index "+ i+" and "+j); // if the sum is found
                    isFound = true;
                    return;
                }
            }
        }
        if (!isFound) {
            System.out.println("The Number you provided is not found!"); // if the sum is not found
        }
    }
}