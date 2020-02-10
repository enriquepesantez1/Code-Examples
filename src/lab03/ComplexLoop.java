package lab03;
import java.util.Scanner;

public class ComplexLoop {
    public static void main(String[] args){

        // Scanner input for deposit
        System.out.println("Enter a double deposit for the initial deposit amount: ");
        Scanner input = new Scanner(System.in);
        double deposit = input.nextDouble();

        // Scanner Input for apy
        System.out.println("Enter a double apy(annual preventage yield): ");
        Scanner input1 = new Scanner(System.in);
        double apy = input1.nextDouble();

        // Scanner input for the maturity
        System.out.println("Enter an integer maturity for the number of months: ");
        Scanner input2 = new Scanner(System.in);
        int maturity = input2.nextInt();

        // For loop for calculating the new deposit
        for(int i = 1; i <= maturity; i++) {
            deposit = deposit + (deposit * (apy / 1000));
            System.out.println("Your new deposit for month " + i +  " is: "  + deposit);
        }
    }
}
