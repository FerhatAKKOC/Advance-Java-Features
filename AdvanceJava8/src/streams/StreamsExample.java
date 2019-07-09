package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        // student name and Acitivities into map
        Predicate<Student> studentPredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> studentgpaPredicate = student -> student.getGpa()>=3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                //.parallelStream()
                .peek(System.out::println) // peek filter
                .filter(studentPredicate) // Stream<Student>
                .peek(student -> { System.out.println("After 1. filter: "+ student); })
                .filter(studentgpaPredicate) // Stream<Student>
                .peek(student -> { System.out.println("After 2. filter: "+ student); })
                .collect(Collectors.toMap(Student::getName, Student::getActivities));  // Map

        System.out.println(studentMap);
    }
}
