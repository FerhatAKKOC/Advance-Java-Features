package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class orElse_orElseGet_orElseThrow {


    public static String orElse(){
       // Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        return optionalStudent
                .map(Student::getName)
                .orElse("Default");
    }

    public static String orElseGet(){
        // Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        return optionalStudent
                .map(Student::getName)
                .orElseGet(() -> "Default");
    }

    public static String orElseThrow(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        // Optional<Student> optionalStudent = Optional.ofNullable(null);
        return optionalStudent
                .map(Student::getName)
                .orElseThrow(() -> new RuntimeException("Student name not found"));
    }

    public static void main(String[] args) {

        System.out.println("orElse: "+ orElse());
        System.out.println("orElseGet: "+ orElseGet());
        System.out.println("orElseThrow: "+ orElseThrow());

    }
}
