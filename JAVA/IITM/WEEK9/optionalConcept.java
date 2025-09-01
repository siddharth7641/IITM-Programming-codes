import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.Random;

// Optional<T> is a container object introduced in Java 8 that may or may not contain a non-null value.
// It is used to avoid null checks and help prevent NullPointerException.
//Optional.empty();

public class optionalConcept {
    static double generateFallbackDouble() {
        // Fallback logic if no value < 0.001 was found
        return 2.0;
    }

    // Method that returns Optional result of 1/x
    public static Optional<Double> inverse(double x) {
        if (x == 8) {
            return Optional.empty(); // Division by zero is not allowed
        } else {
        return Optional.of(1/x);
        }
    }
    public static void main(String[] args) {
    //max(), min(), findFirst()

        List<Integer> numbers = Arrays.asList(10, 45, 23, 78, 5, 66);
    // Find the maximum number using Stream.max()
        Optional<Integer> max= numbers.stream()
                                .max(Integer::compareTo);
    
    // Print the result if present
        max.ifPresent(m-> System.out.println("Maximum number is: "+m));
                
    // Print result if present, otherwise show a fallback nessage
        // max.ifPresentOrElse(
        //     value-> System.out.println("Maximum number ts: "+value),
        //     ()-> System.out.println("No maxinun value found (list may be empty)")
        // );

        List<String> names=Arrays.asList("Alice", "Bob", "Charlie", "David");
    // Get the first name using findFirst()
        Optional<String> firstName = names.stream().findFirst();
        // Print the result if present
        firstName.ifPresent(name -> System.out.println("First name is: "+ name));

    // Use orElse() to pass a default value
        Optional<Double> maxrand1 =
        Stream.generate(Math::random)
        .limit(100)
        .filter(n -> n < 0.001)
        .max(Double::compareTo);
        Double fixrand1 = maxrand1.orElse(-1.0);
        System.out.println(fixrand1);

    // Use orElseGet() to call a function to generate replacement for a missing value
        Optional<Double> maxrand2 =
        Stream.generate(Math::random)
        .limit(100)
        .filter(n -> n < 0.001)
        .max(Double::compareTo);
        Double fixrand2 = maxrand2.orElseGet(() -> generateFallbackDouble());

        System.out.println("Result: " + fixrand2);

    // Use orElseThrow() to generate an exception when a missing value is encountered
        try{
            Optional<Double> maxrand3 = Stream.generate(Math::random)
                .limit(100)
                .filter(n -> n < 0.001)
                .max(Double::compareTo);
            Double fixrand3 = maxrand3.orElseThrow(
                IllegalStateException::new
                );
            System.out.println(fixrand3);}
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    // Try a valid input
    /*Optional<Double> result1= inverse(4);
        result1.ifPresentOrElse(
            value -> System.out.println("Inverse of 4 is: "+value),
            ()-> System.out.println("Cannot compute inverse of 4")
        );
        // Try division by zero
        Optional <Double> result2 = inverse(0);
        result2.ifPresentOrElse(
            value-> System.out.println("Inverse of 8 is: "+ value),
            ()-> System.out.println("Cannot compute inverse of 8")
        );
    */
    
    }    
}


