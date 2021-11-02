package student_lecture;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LectureTest {

    @Test
    public void testGetHighestAverageGrade(){

        // create students
        Student student1 = new Student(List.of(14.38, 90.12, 12.23, 29.18));
        Student student2 = new Student(List.of(14.38, 90.12, 12.23, 29.19));
        Student student3 = new Student(List.of(14.38, 90.12, 12.23, 29.16));
        Student student4 = new Student(List.of(95.00, 95.00, 95.00, 95.00));

        // create an array list of students
        List<Student> studentArrayList  = List.of(student1, student2, student3, student4);

        Lecture lecture = new Lecture();
        Double highestAverageGrade = lecture.getHighestAverageGrade(studentArrayList);

        BigDecimal bd = new BigDecimal(highestAverageGrade).setScale(2, RoundingMode.HALF_UP);
        double roundedGradeAverage = bd.doubleValue();

        assertEquals(roundedGradeAverage, 95.00, 0);
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
        List<JavaProject.BasicJava.Student> naughtyStudentArrayList  = new ArrayList<>();
        naughtyStudentArrayList.addAll(Arrays.asList(naughtyStudent1, naughtyStudent2, naughtyStudent3, naughtyStudent4));

        JavaProject.BasicJava.Lecture lecture = new JavaProject.BasicJava.Lecture();
        Double highestAverageGrade = lecture.getHighestAverageGrade(naughtyStudentArrayList);

        BigDecimal bd = new BigDecimal(highestAverageGrade).setScale(2, RoundingMode.HALF_UP);
        double roundedGradeAverage = bd.doubleValue();


        // assert naught Student scoring higher than they should
        assertEquals(roundedGradeAverage, 110.00, 0);


        // ASSERT A SINGLE NAUGHTY STUDENT SCORING HIGHER

    }


}
