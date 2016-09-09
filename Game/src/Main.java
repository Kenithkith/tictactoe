/**
 * Created by Patryk on 27.07.2016.
 */
public class Main {
    public static void main(String[] args) {

        Pulpit pulpit = new Pulpit();
        Player player = new Player();

        do {

        Circle playerCircle = new Circle();
        Plus playerPlus = new Plus();

        while (pulpit.checkFreeBoxes()) {

            //turn no. 1
            pulpit.pulpitSummary();

            do {
                playerCircle.getNumberFromCircle();
            } while ((!playerCircle.chosenField));

            playerCircle.assignChosenFieldToPlayer();

            if (playerCircle.checkIfCircleWon()) {
                break;
            }

            if (!pulpit.checkFreeBoxes()) break;

            //turn no. 2
            pulpit.pulpitSummary();

            do {
                playerPlus.getNumberFromPlus();
            } while (!playerPlus.chosenField);

            playerPlus.assignChosenFieldToPlayer();

            if (playerPlus.checkIfPlusWon()) {
                break;
            }
        }

        pulpit.clearPulpit();

   } while (pulpit.askForNextGame());

    }
}