package functionalInterfaces;

import java.net.Inet4Address;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator =(o1, o2) -> o1.compareTo(o2);
    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;

        System.out.println(binaryOperator.apply(3,4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);

        System.out.println(maxBy.apply(3,4));

    }
}
