package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamsFindFirstFindAnyExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }

    public static void main(String[] args) {

        Optional<Student> anyStudent = findAnyStudent();

        if(anyStudent.isPresent())
            System.out.println(anyStudent.get());
        else
            System.out.println("Not Found");


         anyStudent = findFirstStudent();
        if(anyStudent.isPresent())
            System.out.println(anyStudent.get());
        else
            System.out.println("Not Found");


    }
}
