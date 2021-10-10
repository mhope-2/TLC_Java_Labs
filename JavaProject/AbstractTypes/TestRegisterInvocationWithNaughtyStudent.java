package JavaProject.AbstractTypes;

import JavaProject.BasicJava.Student;
import JavaProject.Enums.Level;
import JavaProject.Inheritance.NaughtyStudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRegisterInvocationWithNaughtyStudent {
    public static void main(String[] args) {
        Double[] studentGrades = {14.38, 90.12, 12.23, 29.19};

        List<Double> studentGradesArrayList = new ArrayList<>();
        studentGradesArrayList.addAll(Arrays.asList(studentGrades));

        // create students
        NaughtyStudent student1 = new NaughtyStudent(studentGradesArrayList);
        NaughtyStudent student2= new NaughtyStudent(studentGradesArrayList);
        NaughtyStudent student3 = new NaughtyStudent(studentGradesArrayList);

        // create student list
        List<NaughtyStudent> naughtyStudents = new ArrayList<>(Arrays.asList(student1,student2,student3));

        // create a list of nameables
        List<Nameable> nameables = new ArrayList<>(Arrays.asList(student1,student2,student3));

        // create a register
        Register register = new Register(naughtyStudents);

    }
}
