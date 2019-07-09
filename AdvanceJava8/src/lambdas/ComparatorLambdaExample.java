package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

;        // Prior Java 8

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result1: " + comparator.compare(2,1));

        Comparator<Integer>
                compLambda = (Integer a, Integer b)->a.compareTo(b);

        Comparator<Integer> lambda2 = (a, b)->a.compareTo(b);

        System.out.println("Result2: "+compLambda.compare(2,1));
    }
}
