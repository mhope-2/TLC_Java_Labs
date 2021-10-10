package JavaProject.AbstractTypes;

import JavaProject.BasicJava.Student;
import JavaProject.Enums.Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStudentSort {
    public static void main(String[] args) {
        Double[] studentGrades = {14.38, 90.12, 12.23, 29.19};

        List<Double> studentGradesArrayList = new ArrayList<>();
        studentGradesArrayList.addAll(Arrays.asList(studentGrades));

        // create students
        Student student1 = new Student("Zay", studentGradesArrayList, Level.Three);
        Student student2= new Student("Bay", studentGradesArrayList, Level.Two);
        Student student3 = new Student("Aay", studentGradesArrayList, Level.Three);

        // create student list
        List<Student> students = new ArrayList<>(Arrays.asList(student1,student2,student3));

        // create a list of nameables
        List<Nameable> nameables = new ArrayList<>(Arrays.asList(student1,student2,student3));

        // create a register
        Register register = new Register(students);

        for (Student student : register.sort(new StudentComparator(), students)){
            System.out.println(student.getName());
        }
    }
}
