package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student> studentSupplier = () -> {return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball")); };

        Supplier<List<Student>> listSupplier = () -> {return StudentDataBase.getAllStudents(); };

        System.out.println(studentSupplier.get());

        System.out.println(listSupplier.get());

    }
}
