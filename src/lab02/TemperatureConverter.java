package lab02;

import java.util.Scanner;

public class TemperatureConverter {
    /**
     * Main method to test implementation for the convert method.
     * @param args command line arguments
     */
    public static void main(String[] args){
        // Enter your code here...

        // Prompting the user for input
        System.out.println("Enter the temperature you would like to convert and add either C or F to the end");

        // Creating out Scanner variables
        Scanner input = new Scanner(System.in);

        // Creating a variable to store the user input
        String userInput = input.next();

        // Creating two separate variable to check the user input
        double degrees = Double.parseDouble(userInput.substring(0, userInput.length() - 1));
        String metric = userInput.substring(userInput.length()-1);

        // Checking to see what conversion method will be used
        if (metric.equals("f")){
            // Conversion from celsius to fahrenheit
            double fahrenheit = (degrees*(9/5)) + 32;
            // Prompting user of temperature in Celsius
            System.out.println("Your new temperature in Fahrenheit is: " + fahrenheit);
        }
        else {
            // Conversion from fahrenheit to celsius
            double celsius = (degrees - 32) * (5/9) ;
            // Prompting user of temperature in Fahrenheit
            System.out.println("Your new temperature in Celsius is: "+ celsius);
        }
    }
}
