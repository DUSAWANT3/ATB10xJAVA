package Ex009_Strems_LambdaExpressions;

import java.util.List;
import java.util.stream.Collectors;

public class Lab02 {
    public static void main(String[] args) {

 // Filter → pick matching elements
        List<String> names = List.of("John", "Jane", "Jack", "Tom");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println(result); //[John, Jane, Jack]

 //2. Map → transform elements
        List<String> names1 = List.of("John", "Jane");

        List<Integer> lengths = names1.stream()
                .map(String::length) // Transforms each string in the stream to its length using method reference.
                // .map(n -> n.length()) //Both forms are valid and do the same thing: they take each string and return its length.
                .collect(Collectors.toList());

        System.out.println(lengths); // [4, 4]

 //3- Print Unic number --> Short
        List<Integer> value = List.of(2,5,6,2,7,1,8,3,9,1,2);
        value.stream().distinct()
                .sorted()
                .forEach(s -> System.out.println(s));

    }
}
