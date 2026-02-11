import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt(), num_copy = num;

        int temp = 0;
        while(num > 0){
            int digit = num % 10;

            int fact = 1;
            for(int i = 1; i <= digit; i++) fact *= i;

            temp += fact;
            num /= 10;
        }
        System.out.println((temp == num_copy) ? "Strong Number" : "Not Strong Number");
        scan.close();
    }
}
