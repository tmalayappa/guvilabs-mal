package Task3;

import java.util.Scanner;

public class WeekDayNames {

    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the day position (0-6): ");
            int dayPosition = scanner.nextInt();

            if (dayPosition < 0 || dayPosition > 6) {
                throw new ArrayIndexOutOfBoundsException("Day position must be between 0 and 6.");
            }

            String dayName = daysOfWeek[dayPosition];
            System.out.println("Day " + dayPosition + ": " + dayName);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e){
            System.err.println("Error: Please enter a valid integer.");
        } finally {
            scanner.close(); // Close the scanner to release resources
        }
    }
}
