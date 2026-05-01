import java.util.*;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess (1-100): ");
            guess = sc.nextInt();

            if (guess > number)
                System.out.println("Too High get down!");
            else if (guess < number)
                System.out.println("Too Low get up!");
            else
                System.out.println("Congratulations!! You are correct");
        } while (guess != number);
    }
}
