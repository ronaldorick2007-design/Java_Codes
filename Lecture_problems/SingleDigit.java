//Java Programme to convert multi digit number to single digit by using while loop
//LOGIC:
//  divide the number with 10 and get remainder,
//  then add to reduced number(without last digit),
//  and repeat till the number is less than 10
//COMPLEXITY:
//  Time : O(N)     depends on number of digits
//  Space : O(1)    constant no of variables

//Importing library for reading inputs
import java.util.Scanner;

public class SingleDigit{
    public static void main(String args[]){
        //Initializing scanner object
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        //While loop to reduce the number of digits
        while(num > 9){
            int remainder = num % 10;
            //Update condition necessary for while loop
            num = num/10 + remainder;
        }

        System.out.println("The Single Digit :" + num);
        scan.close();
    }
}
