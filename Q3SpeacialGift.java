package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3SpeacialGift {

    public static void main(String[] args) {
        // List of student names.
        List<String> studentNames = Arrays.asList("Siva", "Bob", "Albert", "Bella", "Kumar", "Ajith", "Vijay", "Saravanan", "Uthaya", "Prakash");

        // Use stream to filter names that start with "A".
        List<String> studentsStartingWithA = studentNames.stream()
                .filter(name -> name.startsWith("A")) 
                .collect(Collectors.toList());

        // Print the list of students whose names start with "A".
        System.out.println("Students with names starting with 'A': " + studentsStartingWithA);
    }
}
