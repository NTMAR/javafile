import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
        char player = 'X';
        int row, col;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            // Print the board
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| ");
                System.out.print(board[j][0] + " | ");
                System.out.print(board[j][1] + " | ");
                System.out.print(board[j][2] + " | ");
                System.out.println();
                System.out.println("-------------");
            }

            // Get the player's move
            System.out.println("Player " + player + ", enter your move (row[1-3] column[1-3]): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;

            // Check if the move is valid
            while (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Invalid move, try again.");
                System.out.println("Player " + player + ", enter your move (row[1-3] column[1-3]): ");
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            }

            // Make the move
            board[row][col] = player;

            // Check if the game is over
            if (checkWin(board, player)) {
                System.out.println("Player " + player + " wins!");
                break;
            } else if (i == 8) {
                System.out.println("It's a tie!");
            }

            // Switch to the other player
            player = (player == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    public static boolean checkWin(char[][] board, char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        // No win
        return false;
    }
}
