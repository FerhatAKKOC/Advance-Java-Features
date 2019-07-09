package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    public static List<Integer> mapToObj(){
        return IntStream
                .rangeClosed(1,10)
                .mapToObj(value -> {return new Integer(value);})
                .collect(Collectors.toList());
    }

    public static long mapToLong(){
        return IntStream
                .rangeClosed(1,10)
                .mapToLong(value -> value )  // convert IntStream to LongStream
                .sum();
    }

    public static double mapToDouble(){
        return IntStream
                .rangeClosed(1,10)
                .mapToDouble(value -> value )  // convert IntStream to LongStream
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("mapToObj: "+mapToObj());
        System.out.println("mapToLong: "+mapToLong());
        System.out.println("mapToDouble: "+mapToDouble());
    }
}
