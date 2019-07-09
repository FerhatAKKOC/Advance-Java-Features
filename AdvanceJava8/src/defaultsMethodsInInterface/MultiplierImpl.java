package defaultsMethodsInInterface;

import java.util.List;

public class MultiplierImpl implements Multiplier {
    @Override
    public int multiply(List<Integer> integerList) {
       return integerList.stream()
                .reduce(1,(a,b) -> a*b);
    }

    @Override
    public int size(List<Integer> integerList){
        System.out.println("MultiplierImpl class");
        return integerList.size();
    }

}
