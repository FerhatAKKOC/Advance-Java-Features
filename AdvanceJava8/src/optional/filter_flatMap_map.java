package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class filter_flatMap_map {

    // Filter
    public static void filter(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional
                .filter(student -> student.getGpa()>=3.5)
                .ifPresent(student -> System.out.println(student));
    }

    //map
    public static void map(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional
                .filter(student -> student.getGpa()>=3.5)
                .map(Student::getName)
                .ifPresent(s -> System.out.println(s));
    }

    // flatmap
    public static void flatMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional
                .filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName)
                .ifPresent(s -> System.out.println(s));
    }


    public static void main(String[] args) {
        filter();
        map();
        flatMap();

    }
}
