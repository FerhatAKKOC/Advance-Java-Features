package numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println("Sum is : "+sum);

        OptionalInt max = IntStream.rangeClosed(1, 50).max();
        System.out.println(max.isPresent()?max.getAsInt(): "Not Found");

        OptionalLong min = LongStream.rangeClosed(1, 50).min();
        System.out.println(min.isPresent() ? min.getAsLong() : "Not Found");

        OptionalDouble average = IntStream.rangeClosed(1, 50).average();
        System.out.println(average.isPresent() ? average.getAsDouble() : "Not Found");
    }
}
