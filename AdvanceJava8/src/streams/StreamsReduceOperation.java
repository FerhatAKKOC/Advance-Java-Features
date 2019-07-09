package streams;

import data.Student;
import data.StudentDataBase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceOperation {


    public static int performMultiplication(List<Integer> integers){

        return  integers
                .stream()
                // a=1 (identity) b = 1 result = 1
                // a=1 b=3  result = 3
                // a=3 b=5  result = 15
                // a=15 b=7 result = 105
                .reduce(1,(a, b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers){

        return  integers
                .stream()
                .reduce((a, b) -> a*b);
    }

    public static Optional<Student> getHighestGPAStudent(){

        return StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1, s2) -> s1.getGpa()>s2.getGpa() ? s1 : s2);
    }



    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,3,5,7);

        System.out.println(performMultiplication(integerList));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integerList);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        Optional<Integer> result1 = performMultiplicationWithoutIdentity(new ArrayList<>());
        System.out.println(result1.isPresent());
        if (result1.isPresent()){
            System.out.println(result1.get());
        }
    }
}
