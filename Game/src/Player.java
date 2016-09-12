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
        if (parsedTile >= 1 && parsedTile <= 9) {
            System.out.println("Your choice: " + tile);
            chosenField = true;
        }
        return false;
    }

    void getNumberFromPlayer() {
        do {
            try {
                System.out.println(playerName + " (" + symbol + "), choose the field...");
                tile = scanner.nextLine();
                parsedTile = Integer.parseInt(tile);

                if (parsedTile < 1 || parsedTile > 9) {
                    System.out.println("Enter a value from range 1 - 9");
                    return;
                }

                if (GameBoard.results[parsedTile - 1] == 200 || GameBoard.results[parsedTile - 1] == 100) {
                    System.out.println("This tile is already taken.");
                    return;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("You've given an empty value: ");
                return;
            }
        } while (parsedTile == 0);
        checkIfChosenFieldIsFromRange();
    }

}
