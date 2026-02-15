//Java Programme to reverse a given string
// LOGIC:
//     Get the array as input,
//     Define a function to reverse and return new array.
// COMPLEXITY:
//     Time : O(N)     Iterating through entire list
//     Space : O(N)    Creating new array of same size

// Importing necessary packages
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        //Getting input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();                                          //=>getting size of array
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){                                          //loop to get array elements
            System.out.print("Enter " + i + "th element : ");
            arr[i] = scan.nextInt();
        } 

        //Function call
        int[] result = reverseArray(arr, size);
        //Arrays package => Array to String
        System.out.println("The Reverse Array : " + Arrays.toString(result));
        scan.close();
    }

    //Defining function to reverse array
    public static int[] reverseArray(int[] nums, int size){
        int[] rev_arr = new int[size];
        //Iterating through array to reverse
        for(int i = 0; i < size; i++){
            rev_arr[size - 1 - i] = nums[i];
        }
        //Returning new array
        return rev_arr;
    }
}
