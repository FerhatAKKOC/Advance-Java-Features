package parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformanceResult(Supplier<Integer> supplier , int numberOfTimes){

        long start = System.currentTimeMillis();

        for(int i = 0; i<numberOfTimes; i++)
            supplier.get();
        long end = System.currentTimeMillis();

        return end-start;
    }

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(1,100000).sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(1,100000).parallel().sum();
    }

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(checkPerformanceResult(ParallelStreamExample::sumParallelStream,20));
        System.out.println(checkPerformanceResult(ParallelStreamExample::sumSequentialStream,20));
    }
}
