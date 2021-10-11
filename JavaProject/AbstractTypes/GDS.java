package JavaProject.AbstractTypes;

import JavaProject.BasicJava.Student;
import JavaProject.Enums.Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GDS {
    public static void main(String[] args) {

        Double[] studentGrades = {14.38, 90.12, 12.23, 29.19};

        List<Double> studentGradesArrayList = new ArrayList<>();
        studentGradesArrayList.addAll(Arrays.asList(studentGrades));

        // create students
        Student student1 = new Student("Kay", studentGradesArrayList, Level.Three);
        Student student2= new Student("Jay", studentGradesArrayList, Level.Two);
        Student student3 = new Student("Bay", studentGradesArrayList, Level.Three);

        // new student not part of register
        Student student4 = new Student("Bay", studentGradesArrayList, Level.One);

        // create a list of nameables
        List<Nameable> nameables = new ArrayList<>(Arrays.asList(student1,student2,student3));

        // create a list of students
        List<Student> students = new ArrayList<>(Arrays.asList(student1,student2,student3));

        // create a register
        Register register = new Register(students);

        System.out.println(register.returnGradesAsADoubleStream());


    }
}
