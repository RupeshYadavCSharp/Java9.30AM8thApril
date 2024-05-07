package pack_Methods;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your date of birth (dd-mm-yyyy): ");
        String dobString = scanner.nextLine();

        LocalDate dob = parseDateOfBirth(dobString);
        int age = calculateAge(dob);

        displayDetails(name, dob, age);
    }

    public static LocalDate parseDateOfBirth(String dobString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(dobString, formatter);
    }

    public static int calculateAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }

    public static void displayDetails(String name, LocalDate dob, int age) {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Age: " + age);
    }
}