package JavaProject.AbstractTypes;

import JavaProject.BasicJava.Student;
import JavaProject.Enums.Level;
import JavaProject.Exceptions.StudentNotFoundException;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegisterTest {
    @Test
    public void testReturnsStudentNames(){

        // create student grades
        Double[] studentGrades1 = {14.38, 90.12, 12.23, 29.19};
        Double[] studentGrades2 = {14.38, 90.12, 12.23, 29.19};
        Double[] studentGrades3 = {14.38, 90.12, 12.23, 29.19};
        Double[] studentGrades4 = {100.00, 100.00, 100.00, 100.00};

        // convert grades to array list
        List<Double> studentGradesArrayList1 = new ArrayList<>(Arrays.asList(studentGrades1));
        List<Double> studentGradesArrayList2 = new ArrayList<>(Arrays.asList(studentGrades2));
        List<Double> studentGradesArrayList3 = new ArrayList<>(Arrays.asList(studentGrades3));
        List<Double> studentGradesArrayList4 = new ArrayList<>(Arrays.asList(studentGrades4));

        // create students
        Student student1 = new Student("Kay 1", studentGradesArrayList1);
        Student student2 = new Student("Kay 2",studentGradesArrayList2);
        Student student3 = new Student("Kay 3",studentGradesArrayList3);
        Student student4 = new Student("Kay 4",studentGradesArrayList4);

        // create an array list of nameables
        List<Nameable> nameables = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));

        // create an array list of nameables
        List<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));

        Register register = new Register(students);

        List<String> rightNames = new ArrayList<>(Arrays.asList("Kay 1", "Kay 2", "Kay 3", "Kay 4"));

        // assert string of names returned
        assertEquals(register.getRegister(),  rightNames);

    }

    @Test
    public void getRegisterByLevel(){

        Double[] studentGrades = {14.38, 90.12, 12.23, 29.19};

        List<Double> studentGradesArrayList = new ArrayList<>();
        studentGradesArrayList.addAll(Arrays.asList(studentGrades));

        // create students
        Student student1 = new Student("Kay", studentGradesArrayList, Level.Three);
        Student student2= new Student("Jay", studentGradesArrayList, Level.Two);
        Student student3 = new Student("Bay", studentGradesArrayList, Level.Three);

        // create a list of nameables
        List<Nameable> nameables = new ArrayList<>(Arrays.asList(student1,student2,student3));

        // create a list of students
        List<Student> students = new ArrayList<>(Arrays.asList(student1,student2,student3));

        // create a register
        Register register = new Register(students);

        //create a list of student names
        List<String> studentNames = new ArrayList<>(Arrays.asList("Kay","Bay"));

        assertEquals(register.getRegisterByLevel(Level.Three), studentNames);

    }

    @Test
    public void getRegisterByLevel2(){

        Double[] studentGrades = {14.38, 90.12, 12.23, 29.19};

        List<Double> studentGradesArrayList = new ArrayList<>();
        studentGradesArrayList.addAll(Arrays.asList(studentGrades));

        // create students
        Student student1 = new Student("Kay", studentGradesArrayList, Level.Three);
        Student student2= new Student("Jay", studentGradesArrayList, Level.Two);
        Student student3 = new Student("Bay", studentGradesArrayList, Level.Three);

        // create a list of nameables
        List<Nameable> nameables = new ArrayList<>(Arrays.asList(student1,student2,student3));

        // create a list of students
        List<Student> students = new ArrayList<>(Arrays.asList(student1,student2,student3));

        // create a register
        Register register = new Register(students);

        //create a list of student names
        List<String> studentNames = new ArrayList<>(Arrays.asList("Kay","Bay"));

        assertEquals(register.getRegisterByLevel2(Level.Two), studentNames);

    }

    @Test
    public void testReturnStudentByName() throws StudentNotFoundException {
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

        //create a list of student names
        List<String> studentNames = new ArrayList<>(Arrays.asList("Kay","Bay"));

        // return student name because student exist
        assertEquals(register.returnStudentByName(student1), "Kay");

        // student not part of register... throw StudentNotFoundException exception
        assertThrows(StudentNotFoundException.class, ()-> {
            assertEquals(register.returnStudentByName(student4), "Kays");
        });

    }

    @Test
    public void testReturnGradesAsDoubleStream(){
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

        List<List<Double>> gradeStream = Arrays.asList(student1.getStudentGrades(), student2.getStudentGrades(), student3.getStudentGrades());

        assertEquals(register.returnGradesAsADoubleStream(), gradeStream);
    }

    @Test
    public void testHighestOfStudentGrades(){
        Double[] studentGrades1 = {200.00, 90.12, 12.23, 29.19};
        Double[] studentGrades2 = {201.00, 90.12, 12.23, 29.19};
        Double[] studentGrades3 = {202.00, 90.12, 12.23, 29.19};
        Double[] studentGrades4 = {203.00, 90.12, 12.23, 29.19};

        List<Double> studentGradesArrayList1 = new ArrayList<>(Arrays.asList(studentGrades1));
        List<Double> studentGradesArrayList2 = new ArrayList<>(Arrays.asList(studentGrades2));
        List<Double> studentGradesArrayList3 = new ArrayList<>(Arrays.asList(studentGrades3));
        List<Double> studentGradesArrayList4 = new ArrayList<>(Arrays.asList(studentGrades4));


        // create students
        Student student1 = new Student("Kay", studentGradesArrayList1, Level.Three);
        Student student2= new Student("Jay", studentGradesArrayList2, Level.Two);
        Student student3 = new Student("Bay", studentGradesArrayList3, Level.Three);
        Student student4 = new Student("Bay", studentGradesArrayList4, Level.Three);


        // create a list of nameables
        List<Nameable> nameables = new ArrayList<>(Arrays.asList(student1,student2,student3, student4));

        // create a list of students
        List<Student> students = new ArrayList<>(Arrays.asList(student1,student2,student3, student4));

        // create a register
        Register register = new Register(students);

        // Expected return array
        List<Double> highestGrades = new ArrayList<>(Arrays.asList(200.00, 201.00, 202.00, 203.00));

        register.returnHighestOfAllStudentsGrades();
    }


}
