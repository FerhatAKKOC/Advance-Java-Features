package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){

        BiConsumer<String,List<String>> biConsumer
                =(name, activities) -> System.out.println(name+" : "+ activities);

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));

    }

    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer
                = (a,b)-> System.out.println("a: "+a+" b: "+b);

        biConsumer.accept("Hello", "World");

        BiConsumer<Integer,Integer> multiply
                =(a, b) -> System.out.println("Multiply: " +a*b);


        BiConsumer<Integer,Integer> divide
                =(a, b) -> System.out.println("Division: " +a/b);

        multiply.andThen(divide).accept(42,3);

        nameAndActivities();
    }
}
