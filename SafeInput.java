import java.util.Scanner;
public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine(); }
        while (retString.length() == 0);
        return retString; }

    public static int getInt(Scanner pipe, String prompt) {
        int num = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt()) {
                num = pipe.nextInt();
                valid = true; }
            else {
                System.out.println("Invalid input. Please enter an integer."); }
            pipe.nextLine(); }
        while (!valid);
        return num; }

    public static double getDouble(Scanner pipe, String prompt) {
        double num = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                num = pipe.nextDouble();
                valid = true; }
            else {
                System.out.println("Invalid input. Please enter a number."); }
            pipe.nextLine(); }
        while (!valid);
        return num; }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int num = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                num = pipe.nextInt();
                if (num >= low && num <= high) {
                    valid = true; }
                else {
                    System.out.println("Number must be between " + low + " and " + high + "."); }}
            else {
                System.out.println("Invalid input. Please enter an integer."); }
            pipe.nextLine(); }
        while (!valid);
        return num; }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double num = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                num = pipe.nextDouble();
                if (num >= low && num <= high) {
                    valid = true; }
                else {
                    System.out.println("Number must be between " + low + " and " + high + "."); }}
            else {
                System.out.println("Invalid input. Please enter a number."); }
            pipe.nextLine(); }
        while (!valid);
        return num; }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String answer = "";
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + " (Y/N): ");
            answer = pipe.nextLine();
            if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("YES")) {
                valid = true; }
            else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("NO")) {
                valid = true; }
            else {
                System.out.println("Please enter Y or N."); }}
        while (!valid);
        return answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("YES"); }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input = "";
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            input = pipe.nextLine();
            if (input.matches(regEx)) {
                valid = true; }
            else {
                System.out.println("Invalid input. Please try again."); }}
        while (!valid);
        return input; }}