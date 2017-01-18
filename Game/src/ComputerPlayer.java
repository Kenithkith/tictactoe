import java.util.Scanner;
//import java.util.stream.Stream;

/**
 * Created by user on 23/10/2016.
 */
public class ComputerPlayer extends Player {

    boolean checkIfPlayWithComputer() {

        String gameModeChoice;
        Scanner gameMode = new Scanner(System.in);
        System.out.println("Play with a computer?");
        gameModeChoice = gameMode.nextLine();

        if (gameModeChoice == "Y" || gameModeChoice == "y") {
            return true;
        }

        return false;
    }

}
