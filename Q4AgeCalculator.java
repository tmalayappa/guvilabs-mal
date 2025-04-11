package Task5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Q4AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
        LocalDate birthDate = null;
        while (birthDate == null) {
            System.out.print("Enter your birthdate (yyyy-MM-dd): ");
            String dateString = scanner.nextLine();
            try {
                birthDate = LocalDate.parse(dateString, dateFormatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            }
        }
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");
        scanner.close();
    }
}
