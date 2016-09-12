import java.util.Scanner;

/**
 * Created by Patryk on 09.09.2016.
 */
public class Player {

    Scanner scanner = new Scanner(System.in);
    String playerName;
    String tile;
    boolean chosenField;
    int parsedTile;

    boolean checkIfChosenFieldIsFromRange() {
        if (parsedTile >= 1 && parsedTile <= 9) {
            System.out.println("Your choice: " + tile);
            chosenField = true;
        }
        return false;
    }

    static boolean checkTheWinner() {
        if ((GameBoard.results[0] == 100 && GameBoard.results[1] == 100 && GameBoard.results[2] == 100) ||
                (GameBoard.results[3] == 100 && GameBoard.results[4] == 100 && GameBoard.results[5] == 100) ||
                (GameBoard.results[6] == 100 && GameBoard.results[7] == 100 && GameBoard.results[8] == 100) ||
                (GameBoard.results[0] == 100 && GameBoard.results[3] == 100 && GameBoard.results[6] == 100) ||
                (GameBoard.results[1] == 100 && GameBoard.results[4] == 100 && GameBoard.results[7] == 100) ||
                (GameBoard.results[2] == 100 && GameBoard.results[5] == 100 && GameBoard.results[8] == 100) ||
                (GameBoard.results[0] == 100 && GameBoard.results[4] == 100 && GameBoard.results[8] == 100) ||
                (GameBoard.results[2] == 100 && GameBoard.results[4] == 100 && GameBoard.results[6] == 100)) {
            System.out.println(Circle.circleName + " (O) HAS WON!");
            GameBoard.drawBoard();
            return true;
        } else if ((GameBoard.results[0] == 200 && GameBoard.results[1] == 200 && GameBoard.results[2] == 200) ||
                (GameBoard.results[3] == 200 && GameBoard.results[4] == 200 && GameBoard.results[5] == 200) ||
                (GameBoard.results[6] == 200 && GameBoard.results[7] == 200 && GameBoard.results[8] == 200) ||
                (GameBoard.results[0] == 200 && GameBoard.results[3] == 200 && GameBoard.results[6] == 200) ||
                (GameBoard.results[1] == 200 && GameBoard.results[4] == 200 && GameBoard.results[7] == 200) ||
                (GameBoard.results[2] == 200 && GameBoard.results[5] == 200 && GameBoard.results[8] == 200) ||
                (GameBoard.results[0] == 200 && GameBoard.results[4] == 200 && GameBoard.results[8] == 200) ||
                (GameBoard.results[2] == 200 && GameBoard.results[4] == 200 && GameBoard.results[6] == 200)) {
            System.out.println(Plus.plusName + " (X) HAS WON!");
            GameBoard.drawBoard();
            return true;
        }
        return false;
    }

}
