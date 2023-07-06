import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Guess the Number!");

        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();

        int secretNumber = 12;

        if(guess == secretNumber){
            System.out.println("Correct!");
        } else if(guess > secretNumber) {
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }
    }
}
