/**
 * Created by Patryk on 27.07.2016.
 */
public class Plus extends Player {

    Plus() {
        do {
            System.out.println("Enter name of second player:");
            playerName = scanner.nextLine();
            if (playerName.isEmpty()) {
                System.out.println("You haven't entered your name...");
            }
        } while (playerName.isEmpty());
    }

    void getNumberFromPlus() {

        do {
            try {
                System.out.println(playerName + " (X), choose the field...");
                tile = scanner.nextLine();
                parsedTile = Integer.parseInt(tile);

                if (parsedTile < 1 || parsedTile > 9) {
                    System.out.println("Enter a value from range 1 - 9");
                    return;
                }

                if (Pulpit.results[parsedTile - 1] == 200 || Pulpit.results[parsedTile - 1] == 100) {
                    System.out.println("This tile is already taken.");
                    return;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("You've given an empty value: ");
                return;
            }
        } while (parsedTile == 0);

        super.checkIfChosenFieldIsFromRange();
    }

    void assignChosenFieldToPlayer() {
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
            System.out.println(playerName + " (X) HAS WON!");
            Pulpit.pulpitSummary();
            return true;
        }
        return false;
    }
}