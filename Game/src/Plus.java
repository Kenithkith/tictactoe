import java.util.Scanner;

/**
 * Created by Patryk on 27.07.2016.
 */
public class Plus {
    Scanner scanner = new Scanner(System.in);
    String tile;
    boolean chosenTile;

    void getNumberFromPlus() {
        System.out.println("Plus, choose the field...");

        tile = scanner.nextLine();
        if (tile.equals("1") || tile.equals("2") || tile.equals("3") || tile.equals("4") || tile.equals("5") || tile.equals("6") || tile.equals("7") || tile.equals("8") || tile.equals("9")) {
            chosenTile = true;
        }
        System.out.println("Your choice: " + tile);

        int parsedTile = Integer.parseInt(tile);
        if (Pulpit.results[parsedTile - 1] == 200 || Pulpit.results[parsedTile - 1] == 100) {
            System.out.println("This tile is already taken.");
        }

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
            System.out.println("PLUS WON!");
            Pulpit.pulpitSummary();
            return true;
        }
        return false;
    }
}
