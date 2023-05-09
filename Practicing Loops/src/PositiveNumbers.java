import java.util.Scanner;

public class PositiveNumbers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = 1;
        while (userInput != 0) {
            System.out.println("Enter a number:");
            userInput = scanner.nextInt();
            if (userInput < 0) {
                System.out.println("Your number must be positive.");
            } else if (userInput > 0) {
                System.out.println("You entered: " + userInput);
            }
        }

        System.out.println("Program ended.");
    }
    }

