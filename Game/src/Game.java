/**
 * Created by Patryk on 27.07.2016.
 */
public class Game {
    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard();


        ComputerPlayer computerPlayer = new ComputerPlayer();
        if (!computerPlayer.checkIfPlayWithComputer()) {

            do {

                Circle playerCircle = new Circle();
                Plus playerPlus = new Plus();

                    while (gameBoard.isAnyBoxFree()) {

                        //turn no. 1
                        gameBoard.drawBoard();

                        do {
                            playerCircle.getNumberFromPlayer();
                        } while ((!playerCircle.chosenField));

                        playerCircle.assignChosenFieldToPlayer();


                        if (Player.checkTheWinner(playerCircle, playerPlus)) {
                            break;
                        }

                        gameBoard.checkIfPulpitNotBlocked(playerCircle, playerPlus);

                        if (!gameBoard.isAnyBoxFree()) break;

                        //turn no. 2
                        gameBoard.drawBoard();

                        do {
                            playerPlus.getNumberFromPlayer();
                        } while (!playerPlus.chosenField);

                        playerPlus.assignChosenFieldToPlayer();


                        if (Player.checkTheWinner(playerCircle, playerPlus)) {
                            break;
                        }

                        gameBoard.checkIfPulpitNotBlocked(playerCircle, playerPlus);
                    }


                gameBoard.clear();

            } while (gameBoard.isNextGameChosen());

        } else {
            System.out.println("Loading...");
        }
    }

}