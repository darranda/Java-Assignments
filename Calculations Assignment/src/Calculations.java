import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        double quotient = (float) num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Results:");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + diff);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println(num1 + " % " + num2 + " = " + remainder);
    }
}
