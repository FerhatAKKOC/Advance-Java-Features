package defaultsMethodsInInterface;

// https://www.udemy.com/modern-java-learn-java-8-features-by-coding-it/learn/v4/t/lecture/11291524?start=0

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {

    public static Consumer<Student> studentConsumer = student -> System.out.println(student);
    public static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    public static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
    public static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    public static void sortByName(List<Student> studentList){
        System.out.println("sortByName: ");
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGPA(List<Student> studentList){
        System.out.println("sortByGPA: ");
        studentList.sort(gpaComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChainig(List<Student> studentList){
        System.out.println("comparatorChainig: ");
        studentList.sort( nameComparator.thenComparing(gradeComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> studentList){
        System.out.println("sortWithNullValues: ");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before Sort: ");
        studentList.forEach(studentConsumer);

        sortByName(studentList);

        sortByGPA(studentList);

        comparatorChainig(studentList);
    }
}
