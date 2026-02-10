//Java Programme for finding 9+99+..upto n terms
//LOGIC:
//    Nested loop ,outer loop runs for n terms,
//    inner loop is to calculate each terms(9 ,99, ...)
//COMPLEXITY:
//    Time : O(N)   nested loop
//    Space : O(1)  i,j,num,result,term

//Importing library for input
import java.util.Scanner;

public class NineSeries {
    public static void main(String[] args) {
        //Getting input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        int result = 0;
        //Outer loop : n terms
        for(int i=1;i<=num;i++){
            int term = 0;
            //Inner loop : each term
            for(int t = 1; t<=i; t++){
                term = term*10 + 1;
            }
            result += term * 9;
        }

        System.out.println("9 + 99 + ...till "+num+" terms : " + result);
        scan.close();
    }
}