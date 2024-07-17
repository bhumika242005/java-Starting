import java.util.Random;
import java.util.Scanner;
public class Sps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to rock, paper,scissors ");
        System.out.println("Enter your choice (rock, paper, scissors):");
        String playerChoice = sc.next().toLowerCase();

        int computerChoice = random.nextInt(3);// 0 for rock,1 for paper, 2 for scissors
        String[] options = {"rock","paper","scissors"};
        String computerChoiceString = options[computerChoice];

        System.out.println("Computer Chose:" + computerChoiceString);

         if (playerChoice.equals(computerChoiceString)){
        System.out.println("It's a tie!");
        } else if 
        ((playerChoice.equals("rock")&& computerChoice == 2) ||
         (playerChoice.equals("scissors")&& computerChoice == 1) ||
        (playerChoice.equals("paper")&& computerChoice == 0)) {
        System.out.println("You win!");
    } else {
        System.out.println("Computer wins!");
    }
    }
}