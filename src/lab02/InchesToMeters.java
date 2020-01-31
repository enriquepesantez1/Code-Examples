package lab02;

import java.util.Scanner;

public class InchesToMeters {
    /**
     * Main method to test implementation for the convert method.
     * @param args command line arguments
     */
    // Conversion number.
    final static double METERS_PER_INCH = .0254;

    public static void main(String[] args){
        // Enter your code here...
        // Prompting the user for input
        System.out.print("How many inches would you like to convert ");
        // Creating out Scanner variable for reading user input
        Scanner input = new Scanner(System.in);
        double inches = input.nextDouble();
        // Converting user input into meters
        double meters = inches * METERS_PER_INCH;
        // Printing meters per inch to the user
        System.out.print("Total numbers of meters per inch: " + meters);
    }
}
