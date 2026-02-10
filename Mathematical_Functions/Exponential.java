//Java Programme for finding e^x using series
//LOGIC:
//    Nested loop ,outer loop runs for n terms, 
//    adding up the values of each terms(x^n/n!),
//    inner loop is to calculate n!
//COMPLEXITY:
//    Time : O(N)   nested loop
//    Space : O(1)  i,j,num,result,fact

//Importing library for input
import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        //Getting necessary input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = scan.nextInt();
        System.out.print("Enter no of digits : ");
        int num = scan.nextInt();
        
        double result = 1;
        //Outer loop
        for(int i = 1; i < num; i++){
            int fact = 1;
            //Inner loop, factorial
            for(int j = 1;j <= i;j++) fact *= j;
            //increment result by (x^n/n!)
            result += Math.pow(x, i) / fact;
        }

        System.out.println(result);
        scan.close();
    }
}
