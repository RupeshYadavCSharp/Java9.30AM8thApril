package pack_loop;

import java.util.Scanner;

public class MatchstickGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userPick, computerPick, matchSticks = 21;

        do {
            System.out.println("Number of match sticks left: " + matchSticks);
            System.out.println("Enter the number of match sticks you want to pick (1-4): ");
            userPick = scan.nextInt();

            if (userPick > 4 || userPick < 1) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                continue;
            }

            matchSticks -= userPick;

            if (matchSticks == 0) {
                System.out.println("You lose! The computer will take the last match stick.");
                break;
            }

            computerPick = (matchSticks >= 4) ? 4 : matchSticks;
            matchSticks -= computerPick;



            System.out.println("The computer picks " + computerPick + " match sticks.");
        } while (matchSticks > 0);

        System.out.println("The game is over. The computer wins!");
    }
}
