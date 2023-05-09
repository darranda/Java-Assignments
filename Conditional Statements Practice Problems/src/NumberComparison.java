import java.util.Scanner;
public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int firstNum = scanner.nextInt();
        System.out.println("Enter another number:");
        int secondNum = scanner.nextInt();

        if (firstNum == secondNum) {
            System.out.println("Numbers are the same");
        } else if (firstNum > secondNum){
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }

    }

}
