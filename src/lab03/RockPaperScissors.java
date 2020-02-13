package lab03;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String [] args){

        // Creating an array of strings
        String[] moves = {"rock", "paper", "scissors"};

        // While statement to continue the loop
        while(true){

            // Prompting the user to type their move
            System.out.println("Enter: rock, paper, or scissors");

            // Creating a scanner for the user input
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();

            // Creating a random variable for the computers move
            Random ran = new Random();
            int ranMove = ran.nextInt(3);

            // Creating the nested if statements for checking who wins
            // Checking to see what the user typed
            if(userInput.equals("rock")){

                // Checking to see what the computer chose and then executing based on if statements
                if(moves[ranMove] == "paper"){
                    System.out.println("The computer chose: " + moves[ranMove]);
                    System.out.println("You lose!");
                    break;
                }
                else if(moves[ranMove] == "scissors"){
                    System.out.println("The computer chose: " + moves[ranMove]);
                    System.out.println("You win! Play again!");
                }
                else if(moves[ranMove] == "rock"){
                    System.out.println("The computer chose: " + moves[ranMove]);
                    System.out.println("It's a tie! Play again!");
                }
            }
            else if(userInput.equals("paper")){

                if(moves[ranMove] == "paper"){
                    System.out.println("The computer chose: " + moves[ranMove]);
                    System.out.println("It's a tie! Play again!");
                }
                else if(moves[ranMove] == "scissors"){
                    System.out.println("The computer chose: " + moves[ranMove]);
                    System.out.println("You loose!");
                    break;
                }
                else if(moves[ranMove] == "rock"){
                    System.out.println("The computer chose: " + moves[ranMove]);
                    System.out.println("You win! Play again!");
                }
            }
            else if(userInput.equals("scissors")){

                if(moves[ranMove] == "paper"){
                    System.out.println("The computer chose: " + moves[ranMove]);
                    System.out.println("You win! Play again!");
                }
                else if(moves[ranMove] == "scissors"){
                    System.out.println("The computer chose: " + moves[ranMove]);
                    System.out.println("It's a tie! Play again!");
                }
                else if(moves[ranMove] == "rock"){
                    System.out.println("The computer chose: " + moves[ranMove]);
                    System.out.println("You loose!");
                    break;
                }
            }
        }
    }
}
