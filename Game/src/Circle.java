import java.util.Scanner;

/**
 * Created by Patryk on 27.07.2016.
 */
public class Circle {

    Scanner scanner = new Scanner(System.in);
    String firstPlayerName;

    Circle() {
        do {
            System.out.println("Enter name of first player:");
            firstPlayerName = scanner.nextLine().toUpperCase();
        } while (firstPlayerName.isEmpty());
    }

    String tile;
    boolean chosenField;

    void getNumberFromCircle() {
        chosenField = false;

        round:
        {
            int parsedTile;

            try {
                System.out.println(firstPlayerName + " (O), choose the field...");
                tile = scanner.nextLine();
                parsedTile = Integer.parseInt(tile);
            } catch (NumberFormatException e) {
                System.out.println("An error occured: " + e.getMessage());
                return;
            }

            error:
            {
                try {
                    if (Pulpit.results[parsedTile - 1] == 200 || Pulpit.results[parsedTile - 1] == 100) {
                        System.out.println("This tile is already taken.");
                        break error;
                    }
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Incorrect value entered. Try again with values from 1 to 9.");
                }

                if (parsedTile >= 1 && parsedTile <= 9) {
                    chosenField = true;
                }

                System.out.println("Your choice: " + tile);

                switch (tile) {
                    case "1":
                        Pulpit.results[0] = 100;
                        break;
                    case "2":
                        Pulpit.results[1] = 100;
                        break;
                    case "3":
                        Pulpit.results[2] = 100;
                        break;
                    case "4":
                        Pulpit.results[3] = 100;
                        break;
                    case "5":
                        Pulpit.results[4] = 100;
                        break;
                    case "6":
                        Pulpit.results[5] = 100;
                        break;
                    case "7":
                        Pulpit.results[6] = 100;
                        break;
                    case "8":
                        Pulpit.results[7] = 100;
                        break;
                    case "9":
                        Pulpit.results[8] = 100;
                        break;
                }
            }
        }
    }

    boolean checkIfCircleWon() {
        if ((Pulpit.results[0] == 100 && Pulpit.results[1] == 100 && Pulpit.results[2] == 100) ||
                (Pulpit.results[3] == 100 && Pulpit.results[4] == 100 && Pulpit.results[5] == 100) ||
                (Pulpit.results[6] == 100 && Pulpit.results[7] == 100 && Pulpit.results[8] == 100) ||
                (Pulpit.results[0] == 100 && Pulpit.results[3] == 100 && Pulpit.results[6] == 100) ||
                (Pulpit.results[1] == 100 && Pulpit.results[4] == 100 && Pulpit.results[7] == 100) ||
                (Pulpit.results[2] == 100 && Pulpit.results[5] == 100 && Pulpit.results[8] == 100) ||
                (Pulpit.results[0] == 100 && Pulpit.results[4] == 100 && Pulpit.results[8] == 100) ||
                (Pulpit.results[2] == 100 && Pulpit.results[4] == 100 && Pulpit.results[6] == 100)) {
            System.out.println(firstPlayerName + " (O) HAS WON!");
            Pulpit.pulpitSummary();
            return true;
        }
        return false;
    }
}