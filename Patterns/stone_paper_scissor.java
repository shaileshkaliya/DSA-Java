import java.util.Random;
import java.util.Scanner;

public class stone_paper_scissor {
    public static void main(String[] args) {
        // Define the possible choices
        String[] choices = {"rock", "paper", "scissors"};

        // Create a random number generator
        Random random = new Random();

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int computerChoiceIndex = random.nextInt(choices.length);
            String computerChoice = choices[computerChoiceIndex];

            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String userChoice = scanner.nextLine();

            userChoice = userChoice.toLowerCase();

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println("Your choice: " + userChoice);
            System.out.println("Computer's choice: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }
    }
}
