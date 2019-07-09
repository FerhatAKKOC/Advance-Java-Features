package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxValue {

    public static int findMaxValue(List<Integer> integerList){
        return  integerList
                .stream()
                .reduce(0,(a, b) -> a>b ? a : b);
    }

    public static int findMinValue(List<Integer> integerList){
        return  integerList
                .stream()
                .reduce(0,(a, b) -> a>b ? b : a);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){

        return  integerList
                .stream()
                .reduce((a, b) -> a>b ? a : b);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){

        return  integerList
                .stream()
                .reduce((a, b) -> a>b ? b : a);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        System.out.println("Max Value:" + findMaxValue(integerList));
        System.out.println("Min Value:" + findMinValue(integerList));

        List<Integer> integerEmpty = new ArrayList<>();

        if(findMaxValueOptional(integerEmpty).isPresent())
            System.out.println("Max Value:" + findMaxValueOptional(integerEmpty).get());
        else
            System.out.println("Value is not found");

        if(findMinValueOptional(integerList).isPresent())
            System.out.println("Min Value:" + findMinValueOptional(integerList).get());
        else
            System.out.println("Value is not found");


    }
}
