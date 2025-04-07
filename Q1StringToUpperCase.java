package Task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;

public class Q1StringToUpperCase {
	    public static void main(String[] args) {
	        // Create a stream of strings.
	        Stream<String> names = Stream.of("aBc", "d", "ef");

	        
	        List<String> uppercaseNames = names.map(new Function<String, String>() {
	            @Override
	            public String apply(String s) {
	                return s.toUpperCase();
	            }
	        }).collect(Collectors.toList());

	        // Print the list of upperCase strings.
	        System.out.println("Uppercase names: " + uppercaseNames);
	    }
	}
