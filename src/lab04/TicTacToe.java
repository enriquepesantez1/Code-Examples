package lab04;

import java .util.Scanner;

public class TicTacToe {
    // Create Scanner class to read input from user.
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Entry point to our game
     *
     * @param args commandline arguments.
     */
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0,},
                {0, 0, 0,},
                {0, 0, 0}
        };

        // Initialize player.
        int player = 1;

        // Display game state.
        printBoard(board);


        // main game loop:
        while (hasBlanks(board)) {

            // Get Player Move.
            int[] coordinates = getPlayerMove();
            int row = coordinates[0];
            int col = coordinates[1];

            // Mark the specified space.
            markBoard(board, row, col, player);

            // Switch player for next turn.
            player = (player % 2) + 1;

            // Display game state.
            printBoard(board);
        }
    }

    private static boolean hasBlanks(int[][] board) {
        boolean flag = false;
        // Checks if any element in the integer array "board" has a 0.
        for (int rowNum = 0; rowNum < 3; rowNum++) {
            for (int colNum = 0; colNum < 3; colNum++) {
                if (board[rowNum][colNum] == 0) {
                    flag = true;

                    // Breaks if any 0s are found.
                    break;
                }
            }
        }
        return flag;
    }


    private static void printBoard(int[][] board) {
        // Creates a new String Array that has the user input converted into an Array with Xs and Os.
        String[][] newBoard = convertBoard(board);

        System.out.println("\n");

        // Prints the Board with Xs, Os, and blank cells.
        for (int rowNum = 0; rowNum < 3; rowNum++) {
            System.out.println("+---+---+---+");
            System.out.println("| " + newBoard[rowNum][0] + " | " + newBoard[rowNum][1] + " | " +
                    newBoard[rowNum][2] + " |");
        }

        // Prints the bottom line of the table.
        System.out.println("+---+---+---+\n");

    }

    private static int[] getPlayerMove() {

        // Gets the Row Number from the user (1 - 3) and converts it to the index number (0 - 2).
        System.out.print("Row: ");
        int row = scanner.nextInt() - 1;

        // Gets the Column Number from the user (1 - 3) and converts it to the index number (0 - 2).
        System.out.print("Column: ");
        int col = scanner.nextInt() - 1;

        return new int[]{row, col};
    }

    private static boolean markBoard(int[][] board, int row, int col, int player) {
        // Marks the User Input on the Board if the cell has the value 0.
        if (board[row][col] == 0) {
            board[row][col] = player;
            return true;
        }
        // Returns false if the cell has a non-zero value.
        else {
            return false;
        }
    }

    private static String[][] convertBoard(int[][] board) {

        // Creates a String Array with all elements being spaces.
        String[][] newBoard = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

        // Iterates through every every element in the Integer Array board.
        for (int rowNum = 0; rowNum < 3; rowNum++) {
            for (int colNum = 0; colNum < 3; colNum++) {

                // If the element in the Integer Array is 1 then the corresponding element in the String Array will be X
                if (board[rowNum][colNum] == 1) {
                    newBoard[rowNum][colNum] = "X";
                }
                // If the element in the Integer Array is 2 then the corresponding element in the String Array will be O
                else if (board[rowNum][colNum] == 2) {
                    newBoard[rowNum][colNum] = "O";
                }
            }
        }

        return newBoard;
    }
}