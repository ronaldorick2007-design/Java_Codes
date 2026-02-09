import java.util.Scanner;

public class CosineSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = scan.nextInt();
        System.out.print("Enter no of digits : ");
        int num = scan.nextInt();

        double result = 1;
        for(int i = 1; i < num; i++){
            int exponent = 2*i;
            int fact = 1;
            for(int j = 1; j <= exponent; j++) fact *= j;
            if(i%2 != 0) result -= Math.pow(x, exponent) / fact;
            else result += Math.pow(x, exponent) / fact;
        }

        System.out.println(result);
        scan.close();
}
}
