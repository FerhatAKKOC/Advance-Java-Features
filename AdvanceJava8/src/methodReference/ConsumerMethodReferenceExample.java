package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    //Classname::methodName
    static Consumer<Student>  c1 = System.out::println;  // s -> System.out.println(s);

    //Classname::instanceMethodName
    static Consumer<Student> c2 = Student::printlistOfActivities;   // Instance reference'larda input parameter instance'in kendisidir

    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);

    }
}
