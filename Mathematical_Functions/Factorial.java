import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        int product = 1;

        if(num >= 0){
            for(int i = 1; i <= num; i++){
            product *= i;
        }
        System.out.println("Factorial of "+num+" : " + product);
        }
        else System.out.println("Invalid number");
        scan.close();
    }
}
