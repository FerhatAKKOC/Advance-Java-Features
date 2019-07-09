package defaultsMethodsInInterface;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,3,5);
        Multiplier multiplier = new MultiplierImpl();
        System.out.println("multiply is: " + multiplier.multiply(integerList));
        System.out.println("default method size is: " + multiplier.size(integerList));
        System.out.println("static method size is: " + Multiplier.isEmpty(integerList));

    }
}
