/**
 * Created by Patryk on 27.07.2016.
 */
public class Plus extends Player {

    static String plusName;

    Plus() {
        do {
            System.out.println("Enter name of second player:");
            playerName = scanner.nextLine();
            if (playerName.isEmpty()) {
                System.out.println("You haven't entered your name...");
            }
            this.plusName = playerName;
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

    void assignChosenFieldToPlayer() {
        if ((GameBoard.results[parsedTile - 1] != 100) && (GameBoard.results[parsedTile - 1] != 200))
            GameBoard.results[parsedTile - 1] = 200;
    }
}