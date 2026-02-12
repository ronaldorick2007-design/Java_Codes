//Java Programme to reverse the given number
//LOGIC:
//  Loop,get the last digit(num%10),
//  Multiply with 10 and add next last digit
//COMPLEXITY:
//  Time : O(N)     Loop
//  Space : O(1)    num,digit,reverse_number

//Importing packages for input
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //Getting input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        int reverse_number = 0;
        //Loop
        while(num > 0){
            int digit = num % 10;                           //->Getting last digit
            reverse_number = reverse_number*10 + digit;     //->simple logic
            num /= 10;
        }

        //Printing out
        System.out.println("The Reverse Number : " + reverse_number);
        scan.close();

    }
}
