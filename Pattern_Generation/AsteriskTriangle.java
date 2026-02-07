// Jave Programme to print asterisk in triangular pattern
// LOGIC:
//     Nested loops are used, inner loop is used to print inline pattern
//     outer loops is to move to next lines.
// COMPLEXITY:
//     Time : O(N^2)   Nested loop
//     Space : O(1)    only i, j, num

//Importing packages required for input
import java.util.Scanner;

public class AsteriskTriangle{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        //Getting input from the user
        System.out.print("Enter no of rows: ");
        int rows = scan.nextInt();

        //Outer loop
        for(int i = 1; i <= rows; i++){
            //Inner loop
            for(int j = 1; j <= i; j++){
                //print "*" for j times
                System.out.print("*");
            }
            System.out.println();
        }

        scan.close();
    }
}