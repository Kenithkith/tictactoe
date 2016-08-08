import java.util.Scanner;

/**
 * Created by Patryk on 27.07.2016.
 */
public class Main {
    public static void main(String[] args) {

        Pulpit pulpit = new Pulpit();
        Circle circle1 = new Circle();
        Plus plus1 = new Plus();

        while (pulpit.availabilityOfPulpit()) {

            //turn no. 1
            pulpit.checkAvailableFields();

            do {
                circle1.getNumberFromCircle();
            } while ((!circle1.chosenTile));


            if (circle1.checkIfCircleWon()) {
                break;
            }

            if (!pulpit.availabilityOfPulpit()) break;

            //turn no. 2
            pulpit.checkAvailableFields();

            do {
                plus1.getNumberFromPlus();
            } while (!plus1.chosenTile);


            if (plus1.checkIfPlusWon()) {
                break;
            }
        }

        if (!pulpit.clearPulpit()) {
            pulpit.clearPulpit();
        }
    }
}
