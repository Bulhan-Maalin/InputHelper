import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numGuesser = InputHelper.getRangedInt(scan, "Guess a number between 1 and 10:", 1, 10);
        System.out.println("You guessed " + numGuesser);
    }
}