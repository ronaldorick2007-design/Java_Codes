// Java Programme to print alphabet in pyramid shape
// LOGIC:
//     Nested loops, outer loop iterates for each rows,
//     Inner loop runs along line ,length fixed by maximum occupied space,
//     Series of alphabets are printed only within a window in each rows,
//     The "ABCBA" pattern is determined by variable.
// COMPLEXITY:
//     Time : O(N^2)   nested loop
//     Space : O(1)    rows,i,j,value

// Importing packages required for input
import java.util.Scanner;
public class AlphabetPyramid {
    public static void main(String[] args) {
        //Getting rows
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int rows = scan.nextInt();

        //Outer loop
        for(int i = 1; i<=rows; i++){ 

            //variable to determine alphabet
            int value = 64;   
            
            //Inner loop, (2*rows-1) is maximum space to be occupied
            for(int j = 1; j<=(2*rows-1); j++){

                //If-else to set window for printing                
                if((rows-i<j) && (j<rows+i)){

                    //updating variable based on its position relative to j
                    value = (j <= rows) ? value+1:value-1;
                    //explicitly converting value and printing it
                    System.out.print((char) value);
                }
                //Empty space
                else System.out.print(" ");
            }
            System.out.println();
        }
        scan.close();
    }
    
}
