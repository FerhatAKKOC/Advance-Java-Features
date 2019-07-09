package numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangesExample {

    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1, 10);
        System.out.println("Number of : "+IntStream.range(1, 10).count());
        intStream.forEach(System.out::print);
        System.out.println();
        intStream = IntStream.rangeClosed(1, 10);
        System.out.println("Number of : "+IntStream.rangeClosed(1, 10).count());
        intStream.forEach(System.out::print);

        System.out.println();
        LongStream.rangeClosed(1,10).asDoubleStream().forEach(System.out::print);

        // Double icin range ve rangeClosed tanimli degildir.
    }
}
