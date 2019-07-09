package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivites(){

        return   StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .map(Student::getActivities)  // Stream<List<String>>
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static long printStudentActivitesCount(){

        return   StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .map(Student::getActivities)  // Stream<List<String>>
                .flatMap(List::stream)
                .distinct()
                .count();
    }


    public static void main(String[] args) {
        System.out.println(printStudentActivitesCount());
        System.out.println(printStudentActivites());
    }
}
