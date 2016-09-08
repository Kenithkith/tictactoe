import java.util.Scanner;

/**
 * Created by Patryk on 27.07.2016.
 */
public class Plus {

    Scanner scanner = new Scanner(System.in);
    String secondPlayerName;

    Plus() {
        do {
            System.out.println("Enter name of second player:");
            secondPlayerName = scanner.nextLine();
            if (secondPlayerName.isEmpty()) {
                System.out.println("You haven't entered your name...");
            }
        } while (secondPlayerName.isEmpty());
    }

    String tile;
    boolean chosenField;

    void getNumberFromPlus() {
        chosenField = false;

        int parsedTile;

        do {
            try {
                System.out.println(secondPlayerName + " (X), choose the field...");
                tile = scanner.nextLine();
                parsedTile = Integer.parseInt(tile);
            } catch (NumberFormatException e) {
                System.out.println("An error occured: " + e.getMessage());
                return;
            }

            try {
                if (Pulpit.results[parsedTile - 1] == 200 || Pulpit.results[parsedTile - 1] == 100) {
                    System.out.println("This tile is already taken.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Incorrect value entered. Try again with values from 1 to 9.");
            }
        } while (parsedTile == 0);



        if (parsedTile >= 1 && parsedTile <= 9) {
            chosenField = true;
        }

        System.out.println("Your choice: " + tile);

        switch (tile) {
            case "1":
                Pulpit.results[0] = 200;
                break;
            case "2":
                Pulpit.results[1] = 200;
                break;
            case "3":
                Pulpit.results[2] = 200;
                break;
            case "4":
                Pulpit.results[3] = 200;
                break;
            case "5":
                Pulpit.results[4] = 200;
                break;
            case "6":
                Pulpit.results[5] = 200;
                break;
            case "7":
                Pulpit.results[6] = 200;
                break;
            case "8":
                Pulpit.results[7] = 200;
                break;
            case "9":
                Pulpit.results[8] = 200;
                break;
        }
    }

    boolean checkIfPlusWon() {
        if ((Pulpit.results[0] == 200 && Pulpit.results[1] == 200 && Pulpit.results[2] == 200) ||
                (Pulpit.results[3] == 200 && Pulpit.results[4] == 200 && Pulpit.results[5] == 200) ||
                (Pulpit.results[6] == 200 && Pulpit.results[7] == 200 && Pulpit.results[8] == 200) ||
                (Pulpit.results[0] == 200 && Pulpit.results[3] == 200 && Pulpit.results[6] == 200) ||
                (Pulpit.results[1] == 200 && Pulpit.results[4] == 200 && Pulpit.results[7] == 200) ||
                (Pulpit.results[2] == 200 && Pulpit.results[5] == 200 && Pulpit.results[8] == 200) ||
                (Pulpit.results[0] == 200 && Pulpit.results[4] == 200 && Pulpit.results[8] == 200) ||
                (Pulpit.results[2] == 200 && Pulpit.results[4] == 200 && Pulpit.results[6] == 200)) {
            System.out.println(secondPlayerName + " (X) HAS WON!");
            Pulpit.pulpitSummary();
            return true;
        }
        return false;
    }
}