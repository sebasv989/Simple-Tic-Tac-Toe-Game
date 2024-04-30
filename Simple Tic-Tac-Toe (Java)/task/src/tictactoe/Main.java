package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an empty grid and print it
        char[][] grid = createEmptyGrid();
        printGrid(grid);

        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        char currentPlayer = 'X';

        // Game loop
        while (!isValid) {
            // Ask for player's move
            System.out.print("Enter the coordinates: ");
            int row = scanner.nextInt() - 1;
            int column = scanner.nextInt() - 1;

            // Check if the move is valid
            if (isValidMove(grid, row, column)) {
                // Update the grid with the player's move
                grid[row][column] = currentPlayer;
                // Print the updated grid
                printGrid(grid);

                // Check if the current player wins
                if (checkWin(grid, currentPlayer)) {
                    System.out.println(currentPlayer + " wins");
                    isValid = true;
                } else if (isGridFull(grid)) { // Check if the grid is full
                    System.out.println("Draw");
                    isValid = true;
                } else {
                    // Switch to the next player's turn
                    currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
                }
            } else {
                // If the move is invalid, prompt the player to try again
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    // Method to create an empty grid
    public static char[][] createEmptyGrid() {
        char[][] grid = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' ';
            }
        }
        return grid;
    }

    // Method to print the grid
    public static void printGrid(char[][] grid) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    // Method to check if a move is valid
    public static boolean isValidMove (char[][] grid, int row, int column) {

        if (row >= 0 && row < 3 && column >= 0 && column < 3 && grid[row][column] == ' '){
            return true;
        }

        return false;
    }

    // Method to check if a player wins
    public static boolean checkWin (char[][] grid, char player){

        // Check rows, columns, and diagonals for the given player
        for (int i = 0; i < 3; i++) {

            if ((grid[i][0] == player && grid[i][1] == player && grid[i][2] == player) ||
                    (grid[0][i] == player && grid[1][i] == player && grid[2][i] == player)) {

                return true;

            }
        }
            if ((grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) ||
                    (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player)){

                return true;

            }

        return false;
    }

    // Method to check if the grid is full
    public static boolean isGridFull (char[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
}
