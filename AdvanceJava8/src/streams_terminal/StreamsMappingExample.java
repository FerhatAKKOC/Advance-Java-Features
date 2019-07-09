package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMappingExample {
    public static void main(String[] args) {

        List<String> nameList = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
        System.out.println("nameList: " +nameList);

        nameList = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("nameList: " +nameList);
    }
}
