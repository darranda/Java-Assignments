import java.util.Scanner;
class HelloThere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        String newText = scanner.nextLine();
        System.out.println("Wow- Interesting! Tell me more!");
        String moreText = scanner.nextLine();
        System.out.println("Nice chatting with you! Goodbye!");

    }
}