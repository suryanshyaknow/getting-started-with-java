import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    private int sysChosen; // system's random generated number
    private int nGuesses = 0;
    boolean hasWon = false;

    public GuessTheNumber() {

        System.out.println("\nI'll pick a number from between 0 to 100. To win you must guess the exact same number.");

        int end = 101; // exclusive

        // Generate a random number for the system
        Random random = new Random();
        sysChosen = random.nextInt(end);
        System.out.println("I've picked a number, so the game starts now...");

    }

    public GuessTheNumber(int start, int end) {

        System.out.println(
                "\nI'll pick a number from " + start + " to " + end + ". To win you must guess the exact same number.");

        // Generate a random number for the system
        Random random = new Random();
        sysChosen = random.nextInt(end + 1) + start;
        System.out.println("I've picked a number, so the game starts now...");

    }

    private void isCorrectNumber(int userChosen) {
        if (userChosen == sysChosen) {
            System.out.println("Yeah, my man. Way to go! You've chosen the golden number, you've won.");
            displayScore();
            hasWon = true;
        } else if (Math.abs(userChosen - sysChosen) <= 10) {
            System.out.println("Woah! you're close, do not ever loose hope.");
            nGuesses -= 1;
        } else {
            System.out.println("No good! Try again boi.");
            nGuesses -= 1;
        }
    }

    public void displayScore() {
        System.out.println("Your fuckin' score is " + nGuesses + "!");
    }

    public void takeUserInput() {

        Scanner scanner = new Scanner(System.in);

        while (hasWon == false) {

            System.out.print("\nTake a guess from the said range: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Kindly fucking enter an integer.");
                scanner.nextLine(); // consuming the invalid input
                continue; // start next iteration of the loop
            }

            int userChosen = scanner.nextInt();
            scanner.nextLine(); // consuming the new line character
            isCorrectNumber(userChosen);

        }
        scanner.close();

    }

    public static void main(String[] args) {

        GuessTheNumber guessTheNum = new GuessTheNumber();
        guessTheNum.takeUserInput();

    }

}
