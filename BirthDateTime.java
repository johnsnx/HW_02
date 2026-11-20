import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter birth year", 1921, 2020);
        int month = SafeInput.getRangedInt(in, "Enter birth month", 1, 12);
        int maxDays;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;

            case 2:
                maxDays = 29;
                break;

            default:
                maxDays = 31;
                break; }

        int day = SafeInput.getRangedInt(in, "Enter birth day", 1, maxDays);
        int hours = SafeInput.getRangedInt(in, "Enter birth hour", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter birth minutes", 1, 59);

        System.out.println("\nYour birth date is: " + month + "/" + day + "/" + year);
        System.out.println("Your birth time is: " + hours + ":" + minutes);
    }
}