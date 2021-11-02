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

        // grade array lists
        List<Double> studentGradesArrayList1 = List.of(100.00, 100.00, 100.00, 100.00);
        List<Double> studentGradesArrayList2 = List.of(80.00, 80.00, 80.00, 80.00);
        List<Double> studentGradesArrayList3 = List.of(60.00, 60.00, 60.00, 60.00);
        List<Double> studentGradesArrayList4 = List.of(50.00, 50.00, 50.00, 50.00);


        // create a list of naughty students
        List<NaughtyStudent> naughtyStudentArrayList  = List.of(
                new NaughtyStudent(studentGradesArrayList1),
                new NaughtyStudent(studentGradesArrayList2),
                new NaughtyStudent(studentGradesArrayList3),
                new NaughtyStudent(studentGradesArrayList4)
        );


        Lecture lecture = new Lecture();
        Student naughtyStudent = new Student(naughtyStudentArrayList);
//        Double highestAverageGrade = lecture.getHighestAverageGrade(naughtyStudentArrayList);


        BigDecimal bd = new BigDecimal(highestAverageGrade).setScale(2, RoundingMode.HALF_UP);
        double roundedGradeAverage = bd.doubleValue();


        // assert naught Student scoring higher than they should
        assertEquals(roundedGradeAverage, 110.00, 0);

        // ASSERT A SINGLE NAUGHTY STUDENT SCORING HIGHER

    }


}
