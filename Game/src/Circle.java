/**
 * Created by Patryk on 27.07.2016.
 */
public class Circle extends Player {

    Circle() {
        symbol = "O";
        do {
            System.out.println("Enter name of first player:");
            playerName = scanner.nextLine();
            if (playerName.isEmpty()) {
                System.out.println("You haven't entered your name...");
            }
        } while (playerName.isEmpty());
    }

    void assignChosenFieldToPlayer() {
        if ((GameBoard.results[parsedTile - 1] != 100) && (GameBoard.results[parsedTile - 1] != 200))
            GameBoard.results[parsedTile - 1] = 100;
    }
}