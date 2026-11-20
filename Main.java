import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = SafeInput.getRangedInt(input, "Enter a number", 1, 10);
        System.out.println("Your number is: " + number);

        double price = SafeInput.getRangedDouble(input, "Enter a price", 0.50, 99.99);
        System.out.println("Your price is: " + price);

        String ssn = SafeInput.getRegExString(input, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + ssn);
    }
}