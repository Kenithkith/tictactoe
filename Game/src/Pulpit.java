import java.util.ArrayList;
import java.util.List;

/**
 * Created by Patryk on 27.07.2016.
 */
public class Pulpit {
    int[] pulpitBoxes = new int[9];
    public static int[] results = new int[9];

    Pulpit() {
        for (int i = 0; i < pulpitBoxes.length; i++) {
            pulpitBoxes[i] = i + 1;
        }
        System.out.println("Welcome to the game.");
    }

    boolean clearPulpit() {
        for (int i = 0; i < pulpitBoxes.length; i++) {
            pulpitBoxes[i] = 0;
        }
        System.out.println("The pulpit is empty.");
        return true;
    }

    void checkAvailableFields() {
        System.out.println("Available fields: ");
        for (int i = 0; i < Pulpit.results.length; i++) {
            if(results[i] == 0) {
                System.out.print((i + 1) + ", ");
            }
        }
        System.out.println();
    }

    boolean availabilityOfPulpit() {
        for (int i = 0; i < results.length; i++ ) {
            if (results[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void pulpitSummary() {
        for (int i = 0; i < results.length; i++) {
            System.out.println("Current state on : " + (i + 1) + "=" + results[i]);
        }
    }

}
