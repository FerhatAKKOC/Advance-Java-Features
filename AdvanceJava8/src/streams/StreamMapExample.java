package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {

    static public List<String> namesList(){
        return   StudentDataBase.getAllStudents()
                .stream()                   //Stream<Student>
             //   .peek(System.out::println)
                .map(Student::getName)      // Stream<String>
             //   .peek(System.out::println)
                .map(String::toUpperCase)   // Stream<String>
                .collect(Collectors.toList()); //List<String>
    }

    static public Set<String> namesSet(){
        return   StudentDataBase.getAllStudents()
                .stream()                   //Stream<Student>
                .map(Student::getName)      // Stream<String>
                .map(String::toUpperCase)   // Stream<String>
                .collect(Collectors.toSet()); //List<String>
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
