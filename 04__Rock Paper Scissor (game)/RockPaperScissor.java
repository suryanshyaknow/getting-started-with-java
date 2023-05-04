import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {

        // Ask the user for the number of rounds
        System.out.print("How many rounds of rock, paper, scissors would you like to play: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consuming the new line character
        int userWins = 0;
        int sysWins = 0;

        for (int i = 1; i <= n; i++) {

            String userChoice;

            // Asking user for their choice
            System.out.println("\nGet ready for the round " + i);
            System.out.print("What'd ya choose from Rock, Paper, and Scissor: ");
            userChoice = scanner.nextLine().toLowerCase();

            // Validate input to ensure it only contains letters
            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissor")) {
                System.out.println("Invalid input! For the fuck's sake enter a valid string.");
                userChoice = scanner.nextLine().toLowerCase();
            }
            System.out.println("You chose: " + userChoice);

            // Fetching the system's choice
            Random random = new Random();
            int systemChoice = random.nextInt(3); // Generating random nunber form 0, 1, and 2

            // Switch case statement for mapping random numbers to "rock", "paper", and "scissor"
            String sysChoice = "unknown";
            switch (systemChoice) {
                case 0 -> sysChoice = "rock";
                case 1 -> sysChoice = "paper";
                case 2 -> sysChoice = "scissor";
            }

            // Now determining the outcome of a turn for the User vs System scenario
            if (userChoice.equals("rock") && sysChoice.equals("paper")) {
                System.out.println("Paper beats rock! The System has won.");
                sysWins += 1;
            } else if (userChoice.equals("rock") && sysChoice.equals("scissor")) {
                System.out.println("Rock beats scissor! You've won.");
                userWins += 1;
            } else if (userChoice.equals("paper") && sysChoice.equals("rock")) {
                System.out.println("Paper beats rock! You've won.");
                userWins += 1;
            } else if (userChoice.equals("paper") && sysChoice.equals("scissor")) {
                System.out.println("Scissor beats paper! The System has won.");
                sysWins += 1;
            } else if (userChoice.equals("scissor") && sysChoice.equals("paper")) {
                System.out.println("Scissor beats paper! You've won!");
                userWins += 1;
            } else if (userChoice.equals("scissor") && sysChoice.equals("rock")) {
                System.out.println("Rock beats scissor! The System has won!");
                sysWins += 1;
            } else {
                System.out.println("A fucking draw!");
            }
        }

        System.out.println("\nThe number of bouts you've won are " + userWins);
        System.out.println("The number of bouts the system has won are " + sysWins);

        if (userWins > sysWins) {
            System.out.println("\nQuite clearly, you've emerged as the ultimate winner. Congratu-fucking-lations!");
        } else if (userWins == sysWins) {
            System.out.println("\nThe match has been tied!");
        } else {
            System.out.println("\nYou've lost, have let me down. Now go throw youself in the front of a truck.");
        }
        
        scanner.close();
    }

}
