package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static Optional<String> getStudentNameOptional(){

       // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);

        if(studentOptional.isPresent()){
            return studentOptional.map(Student::getName);  // Optional<String>
        }

        return Optional.empty();
    }



    public static void main(String[] args) {

        Optional<String> stringOptional = getStudentNameOptional();

        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get().length());
        }
        else
            System.out.println("Name not Found");

    }
}
