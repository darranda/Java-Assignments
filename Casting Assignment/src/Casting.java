public class Casting {
    public static void main (String[]args) {
        double doubleNum = 112.35;
        int intNum = (int) doubleNum;
        System.out.println("Double:  " + doubleNum);
        System.out.println("int:  " + intNum);
        String stringNum = "49";
        int newInt = Integer.parseInt(stringNum);
        System.out.println("The string value is: " + stringNum);
        System.out.println("The integer value is: " + newInt);

    }
}
