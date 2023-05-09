import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number less than 11");
        int userInput = scanner.nextInt();

        if (userInput >= 11) {
            System.out.println("Number must be less than 11.");
        } else {
            for (int i = userInput; i <= 11; i++) {
                System.out.println(i);
            }
        }
    }
}