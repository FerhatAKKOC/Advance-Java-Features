package streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Streams_Of_Generate_Iterate_Example {

    public static void main(String[] args) {

        Stream<String> result = Stream.of("Ferat", "Ali", "Serdar");
        result.forEach(System.out::println);

        Stream.iterate(1,s ->s+1)
                .limit(10)
                .forEach(System.out::println);

        Stream.generate(new Random()::nextInt)
                .limit(10)
                .forEach(System.out::println);
    }
}
