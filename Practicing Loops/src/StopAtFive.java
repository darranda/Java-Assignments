import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Give a number: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("5")) {
                break;
            }

        }
    }
}