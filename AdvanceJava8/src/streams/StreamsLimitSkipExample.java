package streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limits(List<Integer> integerList){

        return   integerList
                .stream()
                .limit(3)
                .peek(System.out::print)
                .reduce((a, b) -> a+b );
    }

    public static Optional<Integer> skip(List<Integer> integerList){

        return   integerList
                .stream()
                .skip(3)
                .peek(System.out::print)
                .reduce((a, b) -> a+b );
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,8,9,10);

        Optional<Integer> result = limits(integers);

        if(result.isPresent())
            System.out.println(" Result is " + result.get());
        else
            System.out.println(" No result");

        result= skip(integers);

        if(result.isPresent())
            System.out.println(" Result is " + result.get());
        else
            System.out.println(" No result");



    }
}
