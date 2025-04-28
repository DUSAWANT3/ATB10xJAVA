package Ex009_Strems_LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab01_Streams_Lambda {
    public static void main(String[] args) {

        //Problem: 1
        //You have a list of numbers, and you want only even numbers.
        //Without Stream:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }
        System.out.println(evenNumbers); //[2, 4, 6]

        //With Stream + Lambda:
        // List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenNumbers1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers1);

        //Ex02-Suppose you want to:
        //•	Get names starting with 'A'--Make them uppercase--Collect into a List.

        List<String> names = Arrays.asList("Alex", "Brian", "Charles", "Ankit");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result); // [ALEX, ANKIT]

      //Ex03 -Find squares of even numbers and print them.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Find squares of even numbers
        numbers1.stream()
                .filter(n -> n % 2 == 0)       // Filter out even numbers
                .map(n -> n * n)                // Square the numbers
                .forEach(System.out::println);  // Print each squared number
    }
}
