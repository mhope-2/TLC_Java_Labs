package JavaProject.BasicJava;

import JavaProject.Inheritance.NaughtyStudent;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LectureTest {

    @Test
    public void testGetHighestAverageGrade(){

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
        Student student1 = new Student(studentGradesArrayList1);
        Student student2 = new Student(studentGradesArrayList2);
        Student student3 = new Student(studentGradesArrayList3);
        Student student4 = new Student(studentGradesArrayList4);

        // create an array list of students
        List<Student> studentArrayList  = new ArrayList<>();
        studentArrayList.addAll(Arrays.asList(student1, student2, student3, student4));

        Lecture lecture = new Lecture();
        Double highestAverageGrade = lecture.getHighestAverageGrade(studentArrayList);

        BigDecimal bd = new BigDecimal(highestAverageGrade).setScale(2, RoundingMode.HALF_UP);
        double roundedGradeAverage = bd.doubleValue();

        assertEquals(roundedGradeAverage, 100.00, 0);
    }


    @Test
    public void testNaughtyStudentScoringHigher(){

        // student grades
        Double[] naughtyStudentGrades1 = { 100.00, 100.00, 100.00, 100.00 };
        Double[] naughtyStudentGrades2 = { 100.00, 100.00, 100.00, 100.00 };
        Double[] naughtyStudentGrades3 = { 100.00, 100.00, 100.00, 100.00 };
        Double[] naughtyStudentGrades4 = { 100.00, 100.00, 100.00, 100.00 };

        // grade array lists
        List<Double> studentGradesArrayList1 = new ArrayList<>(Arrays.asList(naughtyStudentGrades1));
        List<Double> studentGradesArrayList2 = new ArrayList<>(Arrays.asList(naughtyStudentGrades2));
        List<Double> studentGradesArrayList3 = new ArrayList<>(Arrays.asList(naughtyStudentGrades3));
        List<Double> studentGradesArrayList4 = new ArrayList<>(Arrays.asList(naughtyStudentGrades4));

        // naughty students
        NaughtyStudent naughtyStudent1 = new NaughtyStudent(studentGradesArrayList1);
        NaughtyStudent naughtyStudent2 = new NaughtyStudent(studentGradesArrayList2);
        NaughtyStudent naughtyStudent3 = new NaughtyStudent(studentGradesArrayList3);
        NaughtyStudent naughtyStudent4 = new NaughtyStudent(studentGradesArrayList4);


        // create an array list of students
        List<Student> naughtyStudentArrayList  = new ArrayList<>();
        naughtyStudentArrayList.addAll(Arrays.asList(naughtyStudent1, naughtyStudent2, naughtyStudent3, naughtyStudent4));

        Lecture lecture = new Lecture();
        Double highestAverageGrade = lecture.getHighestAverageGrade(naughtyStudentArrayList);

        BigDecimal bd = new BigDecimal(highestAverageGrade).setScale(2, RoundingMode.HALF_UP);
        double roundedGradeAverage = bd.doubleValue();


        // assert naught Student scoring higher than they should
        assertEquals(roundedGradeAverage, 110.00, 0);

        // ASSERT A SINGLE NAUGHTY STUDENT SCORING HIGHER

    }


}
