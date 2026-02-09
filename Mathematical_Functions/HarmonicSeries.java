import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        double harmonic_sum = 0;
        if(num != 0){
            for(int i = 1; i <= num; i++){
            harmonic_sum += 1.0 / i;
            }
            System.out.println("The harmonic sum till " + num + " digits : " + harmonic_sum);
        }
        else System.out.println("Invalid Number");

        scan.close();
    }
    
}
