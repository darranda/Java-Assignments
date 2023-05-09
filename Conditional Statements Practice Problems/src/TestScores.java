import java.util.Scanner;

public class TestScores {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name a number between 0 and 100:");
        int testScore = scanner.nextInt();

        if (testScore >= 90 && testScore <= 100) {
            System.out.println("Your grade is an A =)");
        } else if (testScore >= 80 && testScore < 90) {
            System.out.println("Your grade is a B =)");
        } else if (testScore >= 70 && testScore < 80) {
            System.out.println("Your grade is a C =/");
        } else if (testScore >= 60 && testScore < 70) {
            System.out.println("Your grade is a D =(");
        } else if (testScore >= 0 && testScore < 60) {
            System.out.println("Your grade is an F =(");
        } else {
            System.out.println("Please enter a score between 0 and 100.");
        }
    }
}
