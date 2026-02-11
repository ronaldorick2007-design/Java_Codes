import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        int divisor_sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0) divisor_sum += i;
        }

        if(num == divisor_sum)System.out.println("Perfect Number");
        else System.out.println("Not Perfect Number");

        scan.close();
    }
}
