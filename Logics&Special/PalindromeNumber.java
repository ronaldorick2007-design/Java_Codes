import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt(), num_copy = num;

        int reverse_number = 0;
        while(num > 0){
            int digit = num % 10;
            reverse_number = reverse_number*10 + digit;
            num /= 10;
        }

        System.out.println((reverse_number == num_copy) ? "Palindrome Number" : "Not a Palindrome");
        scan.close();

}
}
