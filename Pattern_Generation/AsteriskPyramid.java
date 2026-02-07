// Java Programme to print asterisk in pyramid shape
// LOGIC:
//     Nested loops are used,
//     outer loop is to move next and set no of odd asterisks in a line,
//     inner loop is to run for maximum stretch of space(2*rows -1),
//     if-else is used to position the asterisks middle.
// COMPLEXITY:
//     Time : O(N^2)   Nested loop
//     Space : O(1)    only rows,i,j

// Importing necessary package for input
import java.util.Scanner;
public class AsteriskPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int rows = scan.nextInt();

        for(int i = 1; i <= rows; i++){

            //Inner loop is upto 2*rows - 1 size
            for(int j = 1; j <= (2*rows - 1); j++){
                
                //positioning asterisks in middle of each row
                if((rows - i < j) && (j < rows + i)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            scan.close();
        }
    }    
}