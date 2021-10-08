package JavaProject.AbstractTypes;

import JavaProject.BasicJava.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegisterTest {
//    @Test
//    public void testReturnsStudentNames(){

//        // create student grades
//        Double[] studentGrades1 = {14.38, 90.12, 12.23, 29.19};
//        Double[] studentGrades2 = {14.38, 90.12, 12.23, 29.19};
//        Double[] studentGrades3 = {14.38, 90.12, 12.23, 29.19};
//        Double[] studentGrades4 = {100.00, 100.00, 100.00, 100.00};
//
//        // convert grades to array list
//        List<Double> studentGradesArrayList1 = new ArrayList<>(Arrays.asList(studentGrades1));
//        List<Double> studentGradesArrayList2 = new ArrayList<>(Arrays.asList(studentGrades2));
//        List<Double> studentGradesArrayList3 = new ArrayList<>(Arrays.asList(studentGrades3));
//        List<Double> studentGradesArrayList4 = new ArrayList<>(Arrays.asList(studentGrades4));
//
//        // create students
//        Student student1 = new Student("Kay 1", studentGradesArrayList1);
//        Student student2 = new Student("Kay 2",studentGradesArrayList2);
//        Student student3 = new Student("Kay 3",studentGradesArrayList3);
//        Student student4 = new Student("Kay 4",studentGradesArrayList4);
//
//        // create an array list of nameables
//        List<Nameable> nameables = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));
//
//        Register register = new Register(nameables);
//        register.getRegister();


//    }

    public static void main(String[] args) {

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

        Register register = new Register(nameables);
        System.out.println( register.getRegister() );


    }
}
