package defaultsMethodsInInterface;

import java.util.List;

public interface Multiplier {

    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList){
        System.out.println("Multiplier Interface");
        return integerList.size();
    }
    static boolean isEmpty(List<Integer> integerList){
            return integerList.isEmpty();
    }
}
