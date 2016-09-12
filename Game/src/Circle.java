/**
 * Created by Patryk on 27.07.2016.
 */
public class Circle extends Player {

    static String circleName;

    Circle() {
        do {
            System.out.println("Enter name of first player:");
            playerName = scanner.nextLine();
            if (playerName.isEmpty()) {
                System.out.println("You haven't entered your name...");
            }
            this.circleName = playerName;
        } while (playerName.isEmpty());
    }

    void getNumberFromCircle() {

        do {
            try {
                System.out.println(playerName + " (O), choose the field...");
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

        checkIfChosenFieldIsFromRange();
    }

    void assignChosenFieldToPlayer() {
        if ((Pulpit.results[parsedTile - 1] != 100) && (Pulpit.results[parsedTile - 1] != 200))
            Pulpit.results[parsedTile - 1] = 100;
    }
}