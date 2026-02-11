import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        int num_copy= num,num_copy_copy = num, digits = 0, total = 0;

        while(num>0){
            digits ++;
            num /= 10;
        }
        while(num_copy>0){
            int rem = num_copy%10;
            total += Math.pow(rem,digits);
            num_copy /= 10;
        }

        System.out.println((total==num_copy_copy)?"Armstrong NUmber":"Not Armstrong Number");
        scan.close();
    }
}
