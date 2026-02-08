// Java Programme to print asterisk in diamond shape
// LOGIC:
//     Nested loops, outer loop iterates for each rows,
//     Inner loop runs along line ,length fixed by maximum occupied space,
//     Series of asterisks are printed only within a window in each rows,
//     The window length is determined by i,j
// COMPLEXITY:
//     Time : O(N^2)   nested loop
//     Space : O(1)    rows,i,j,split

// Importing packages required for input
import java.util.Scanner;
public class DiamondPattern{
    public static void main(String[] args) {
        //Getting rows
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int rows = scan.nextInt();
        
        //Outer loop
        for(int i = 1; i <= rows; i++){

            //a variable to maintain symmetricity horizontally
            //the update condition is line and its shifted orthogonal(x and k-x)
            int split = (i > (rows+1) / 2) ? rows+1-i : i;

            //Inner loop, (2*rows-1) is maximum space to be occupied
            for(int j = 1; j <= (2*rows-1); j++){

                //If-else to set window for printing
                if((rows - split < j) && (j < rows + split)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }        
        scan.close();
    }    
}