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
        if ((Pulpit.results[0] == 100 && Pulpit.results[1] == 100 && Pulpit.results[2] == 100) ||
                (Pulpit.results[3] == 100 && Pulpit.results[4] == 100 && Pulpit.results[5] == 100) ||
                (Pulpit.results[6] == 100 && Pulpit.results[7] == 100 && Pulpit.results[8] == 100) ||
                (Pulpit.results[0] == 100 && Pulpit.results[3] == 100 && Pulpit.results[6] == 100) ||
                (Pulpit.results[1] == 100 && Pulpit.results[4] == 100 && Pulpit.results[7] == 100) ||
                (Pulpit.results[2] == 100 && Pulpit.results[5] == 100 && Pulpit.results[8] == 100) ||
                (Pulpit.results[0] == 100 && Pulpit.results[4] == 100 && Pulpit.results[8] == 100) ||
                (Pulpit.results[2] == 100 && Pulpit.results[4] == 100 && Pulpit.results[6] == 100)) {
            System.out.println(Circle.circleName + " (O) HAS WON!");
            Pulpit.pulpitSummary();
            return true;
        } else if ((Pulpit.results[0] == 200 && Pulpit.results[1] == 200 && Pulpit.results[2] == 200) ||
                (Pulpit.results[3] == 200 && Pulpit.results[4] == 200 && Pulpit.results[5] == 200) ||
                (Pulpit.results[6] == 200 && Pulpit.results[7] == 200 && Pulpit.results[8] == 200) ||
                (Pulpit.results[0] == 200 && Pulpit.results[3] == 200 && Pulpit.results[6] == 200) ||
                (Pulpit.results[1] == 200 && Pulpit.results[4] == 200 && Pulpit.results[7] == 200) ||
                (Pulpit.results[2] == 200 && Pulpit.results[5] == 200 && Pulpit.results[8] == 200) ||
                (Pulpit.results[0] == 200 && Pulpit.results[4] == 200 && Pulpit.results[8] == 200) ||
                (Pulpit.results[2] == 200 && Pulpit.results[4] == 200 && Pulpit.results[6] == 200)) {
            System.out.println(Plus.plusName + " (X) HAS WON!");
            Pulpit.pulpitSummary();
            return true;
        }
        return false;
    }

}
