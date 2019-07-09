package imperativedeclarative;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeDeclarativeExample2 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,3,4,5,5,6,7,7,8,8,9,10);

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer value: integerList){
            if(!uniqueList.contains(value))
                uniqueList.add(value);
        }

        System.out.println("Imperative: "+uniqueList);

        List<Integer> collect = uniqueList.stream().distinct().collect(Collectors.toList());

        System.out.println("Declarative: "+collect);
    }
}
