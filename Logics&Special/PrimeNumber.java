//Java Programme to check whether the given number is prime
//LOGIC:
//  Loop,iterate from 2 to n/2,check whether the number is divisible,
//  if its divisible ,then immediately flag and break the loop
//COMPLEXITY:
//  Time : O(N)     Loop
//  Space : O(1)    num,i,isFlagged

//Importing packages for input
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //Getting input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        //Declaring flag
        boolean isFlagged = false;

        //Base case
        if(num == 1) isFlagged = true;

        //Loop till n/2
        for(int i = 2;i <= num/2; i++){
            //If divisible, flag and break
            if(num%i == 0){
                isFlagged = true;
                break;
            }
        }

        //Print output
        System.out.println((isFlagged) ? "Not a prime" : "prime");
        scan.close();
    }
}
