/**
 * Created by Patryk on 27.07.2016.
 */
public class Game {
    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard();

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
    }

//    static boolean hasPlayerWon(int playerId) {
//         return (GameBoard.results[0] == playerId && GameBoard.results[1] == playerId && GameBoard.results[2] == playerId) ||
//                (GameBoard.results[3] == playerId && GameBoard.results[4] == playerId && GameBoard.results[5] == playerId) ||
//                (GameBoard.results[6] == playerId && GameBoard.results[7] == playerId && GameBoard.results[8] == playerId) ||
//                (GameBoard.results[0] == playerId && GameBoard.results[3] == playerId && GameBoard.results[6] == playerId) ||
//                (GameBoard.results[1] == playerId && GameBoard.results[4] == playerId && GameBoard.results[7] == playerId) ||
//                (GameBoard.results[2] == playerId && GameBoard.results[5] == playerId && GameBoard.results[8] == playerId) ||
//                (GameBoard.results[0] == playerId && GameBoard.results[4] == playerId && GameBoard.results[8] == playerId) ||
//                (GameBoard.results[2] == playerId && GameBoard.results[4] == playerId && GameBoard.results[6] == playerId);
////    }
//
//    static boolean checkTheWinner(Player circle, Player plus) {
//
//        if (Player.hasPlayerWon(100)) {
//                System.out.println(circle.playerName + " (O) HAS WON!");
//                GameBoard.drawBoard();
//                return true;
//        }
//
//        if (Player.hasPlayerWon(200)) {
//                System.out.println(plus.playerName + " (X) HAS WON!");
//                GameBoard.drawBoard();
//                return true;
//        }
//
//        return false;
//    }

}