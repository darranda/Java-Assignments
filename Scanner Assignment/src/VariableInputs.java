import java.util.Scanner;

public class VariableInputs {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a string of text: ");
        String stringInput = String.valueOf(scanner.nextLine());

        System.out.println("Enter an inter: ");
        String intInput = String.valueOf(scanner.nextLine());
        System.out.println("Enter a double: ");
        String doubleInput = String.valueOf(scanner.nextLine());

        System.out.println("Enter a boolean value: ");
        String booleanInput = String.valueOf(scanner.nextLine());

        System.out.println ("Your string is " + stringInput);
        System.out.println("Your integer is " + intInput);
        System.out.println("Your double is " + doubleInput);
        System.out.println("Your boolean is " + booleanInput);

    }
}
