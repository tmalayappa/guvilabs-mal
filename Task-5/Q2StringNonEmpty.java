package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q2StringNonEmpty {

    public static void main(String[] args) {
        // Create a list of strings, including an empty string.
        List<String> data = Arrays.asList("abc", "bc", "efg", "abcd", "", "jkl", "");

        // Use the filter() method to keep only non-empty strings, without a lambda.
        List<String> nonEmtpyStrings = data.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return !s.isEmpty();
                    }
                })
                .collect(Collectors.toList());

        // Print the list of non-empty strings.
        System.out.println("Non-empty strings: " + nonEmtpyStrings);
    }
}
