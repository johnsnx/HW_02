import java.util.Scanner;
public class Reggie {
    public  static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        String mNumber = SafeInput.getRegExString(in, "Enter your UC M number", "(M|m)\\d{5}");
        String zip = SafeInput.getRegExString(in, "Enter your ZIP+4 code", "\\d{5}-\\d{4}");

        System.out.println("\nYour SSN is: " + ssn);
        System.out.println("Your UC M number is: " + mNumber);
        System.out.println("Your ZIP+4 code is: " + zip);
    }
}
