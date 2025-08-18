import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class streamsConcept {
    public static void main(String[] args) {
        
        List<Integer> nums =  Arrays.asList(1,5,9,15,100);

// A Stream can only be used once and after that it is closed
        // Stream <Integer> data = nums.stream();
        // data.forEach(n -> System.out.println(n));


        Predicate <Integer> pred= n -> n%2 ==1;

        nums.stream()
        .filter(pred)
            .map(n -> n*2)
                .sorted()
                    .forEach(n -> System.out.println(n));

    }
}

