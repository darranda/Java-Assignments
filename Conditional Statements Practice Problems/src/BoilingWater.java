import java.util.Scanner;
public class BoilingWater {
    public static void main (String[]args) {
        System.out.println("Enter a number greater than 212:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 212) {
            System.out.println("Water is boiling!");
        }
    }
}
