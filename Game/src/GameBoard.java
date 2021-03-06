import java.util.Scanner;

/**
 * Created by Patryk on 27.07.2016.
 */
public class GameBoard {
    int[] pulpitBoxes = new int[9];
    public static int[] results = new int[9];

    GameBoard() {
        for (int i = 0; i < pulpitBoxes.length; i++) {
            pulpitBoxes[i] = i + 1;
        }
        System.out.println("Welcome to the game.");
    }

    boolean clear() {
        for (int i = 0; i < pulpitBoxes.length; i++) {
            pulpitBoxes[i] = 0;
            results[i] = 0;
            shapesAssignments[i] = " ";
        }
        System.out.println("The pulpit is empty.");
        return true;
    }

    boolean isAnyBoxFree() {
        for (int i = 0; i < results.length; i++ ) {
            if (results[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static String[] shapesAssignments = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    public static void drawBoard() {
        for (int i = 0; i < results.length; i++) {
            if (results[i] == 100) {
                shapesAssignments[i] = "O";
            } else if (results[i] == 200) {
                shapesAssignments[i] = "X";
            }
        }

        System.out.print(shapesAssignments[0] + "|" + shapesAssignments[1] + "|" + shapesAssignments[2]);
        System.out.println("          1 | 2 | 3");
        System.out.print("-----");
        System.out.println("         -----------");
        System.out.print(shapesAssignments[3] + "|" + shapesAssignments[4] + "|" + shapesAssignments[5]);
        System.out.println("   -->    4 | 5 | 6");
        System.out.print("-----");
        System.out.println("         -----------");
        System.out.print(shapesAssignments[6] + "|" + shapesAssignments[7] + "|" + shapesAssignments[8]);
        System.out.println("          7 | 8 | 9");
        System.out.println();
    }

    void checkIfPulpitNotBlocked(Player circle, Player plus) {
        if (!isAnyBoxFree() && !Player.checkTheWinner(circle, plus)) {
            System.out.println("Nobody won :-(");
        }
    }

    public boolean isNextGameChosen() {
        Scanner decision = new Scanner(System.in);
        System.out.println("Do you want to play again? Y/N");
        String choice = decision.nextLine();
        if (choice.equals("y") || choice.equals("Y")) {
            clear();
            return true;
        }
        return false;
    }
}
