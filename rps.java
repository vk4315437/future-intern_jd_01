import java.util.Random;
import java.util.Scanner;

public class rps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ROCK PAPER SCISSORS");
        Random random = new Random();

        while (true) {
            System.out.println("Enter move (rock, paper, scissors). To exit the game, type 'exit':");
            String userMove = sc.nextLine();
            if (userMove.equals("exit")) {
                System.out.println("Game Over");
                break;
            }

            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid move! Please enter rock, paper, or scissors.");
                continue;
            }

            String[] moves = {"rock", "paper", "scissors"};
            String computerMove = moves[random.nextInt(moves.length)];

            System.out.println("Computer chose: " + computerMove);

            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                       (userMove.equals("scissors") && computerMove.equals("paper")) ||
                       (userMove.equals("paper") && computerMove.equals("rock"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        sc.close();
    }
}
