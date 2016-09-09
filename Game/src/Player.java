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

}
