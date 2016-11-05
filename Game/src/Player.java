import java.util.Scanner;

/**
 * Created by Patryk on 09.09.2016.
 */
public class Player {

    Scanner scanner = new Scanner(System.in);
    String playerName;
    String tile;
    String symbol;
    boolean chosenField;
    int parsedTile;

    boolean checkIfChosenFieldIsFromRange() {
        try {
            if (parsedTile < 1 || parsedTile > 9) {
                System.out.println("Enter a value from range 1 - 9");
                return false;
            }
            System.out.println("Your choice: " + tile);
            chosenField = true;
            return true;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Given value is from out of acceptable range. " + e.getMessage());
            return false;
        }
    }

    void getNumberFromPlayer() {
        do {
            try {
                System.out.println(playerName + " (" + symbol + "), choose the field...");
                tile = scanner.nextLine();
                parsedTile = Integer.parseInt(tile);

                if (!checkIfChosenFieldIsFromRange()) {
                    chosenField = false;
                    return;
                }

                if (GameBoard.results[parsedTile - 1] == 200 || GameBoard.results[parsedTile - 1] == 100) {
                    System.out.println("This tile is already taken.");
                    chosenField = false;
                    return;
                }
            }
            catch (NumberFormatException nfe) {
                System.out.println("You've given an empty value: ");
                chosenField = false;
                return;
            }
        } while (parsedTile == 0);
    }

    static boolean hasPlayerWon(int playerId) {
        return (GameBoard.results[0] == playerId && GameBoard.results[1] == playerId && GameBoard.results[2] == playerId) ||
                (GameBoard.results[3] == playerId && GameBoard.results[4] == playerId && GameBoard.results[5] == playerId) ||
                (GameBoard.results[6] == playerId && GameBoard.results[7] == playerId && GameBoard.results[8] == playerId) ||
                (GameBoard.results[0] == playerId && GameBoard.results[3] == playerId && GameBoard.results[6] == playerId) ||
                (GameBoard.results[1] == playerId && GameBoard.results[4] == playerId && GameBoard.results[7] == playerId) ||
                (GameBoard.results[2] == playerId && GameBoard.results[5] == playerId && GameBoard.results[8] == playerId) ||
                (GameBoard.results[0] == playerId && GameBoard.results[4] == playerId && GameBoard.results[8] == playerId) ||
                (GameBoard.results[2] == playerId && GameBoard.results[4] == playerId && GameBoard.results[6] == playerId);
    }

    static boolean checkTheWinner(Player circle, Player plus) {

        if (hasPlayerWon(100)) {
            System.out.println(circle.playerName + " (O) HAS WON!");
            GameBoard.drawBoard();
            return true;
        }

        if (hasPlayerWon(200)) {
            System.out.println(plus.playerName + " (X) HAS WON!");
            GameBoard.drawBoard();
            return true;
        }

        return false;
    }

}
