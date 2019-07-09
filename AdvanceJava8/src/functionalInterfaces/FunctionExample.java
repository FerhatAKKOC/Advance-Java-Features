package functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> function = s -> s.toUpperCase();
    static Function<String,String> addStr = s -> s.toUpperCase().concat("default");

    public static void main(String[] args) {

        System.out.println("Result: "+function.apply("java8"));
        System.out.println("Result: " +function.andThen(addStr).apply( "java8 "));
        System.out.println("Result: " +function.compose(addStr).apply("java8 "));

        System.out.println("Result: " +performConcat("Hello "));
    }


    public static String performConcat(String str){
        return addStr.apply(str);
    }
}
