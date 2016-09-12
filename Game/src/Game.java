/**
 * Created by Patryk on 27.07.2016.
 */
public class Game {
    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard();
        Player player = new Player();

        do {

        Circle playerCircle = new Circle();
        Plus playerPlus = new Plus();

        while (gameBoard.isAnyBoxFree()) {

            //turn no. 1
            gameBoard.drawBoard();

            do {
                playerCircle.getNumberFromCircle();
            } while ((!playerCircle.chosenField));

            playerCircle.assignChosenFieldToPlayer();


            if (player.checkTheWinner()) {
                break;
            }

            gameBoard.checkIfPulpitNotBlocked();

            if (!gameBoard.isAnyBoxFree()) break;

            //turn no. 2
            gameBoard.drawBoard();

            do {
                playerPlus.getNumberFromPlus();
            } while (!playerPlus.chosenField);

            playerPlus.assignChosenFieldToPlayer();


            if (player.checkTheWinner()) {
                break;
            }

            gameBoard.checkIfPulpitNotBlocked();
        }

        gameBoard.clear();

   } while (gameBoard.isNextGameChosen());

    }
}