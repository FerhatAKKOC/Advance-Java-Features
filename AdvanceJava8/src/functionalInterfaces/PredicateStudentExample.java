package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p =s -> s.getGradeLevel()>=3;
    static Predicate<Student> p1 =s -> s.getGpa()>=3.9;


    public static void filterStudentByGradeLevel(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGPA(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGradeLevelANDGPA(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p.and(p1).test(student)){
                System.out.println(student);
            }
        });
    }


    public static void main(String[] args) {

        // filterStudentByGradeLevel();
        // filterStudentByGPA();

        filterStudentByGradeLevelANDGPA();

    }
}
