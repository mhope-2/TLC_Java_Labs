package student_lecture;

import JavaProject.BasicJava.Student;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void checkAverageGrade(){

        Double[] studentGrades = {14.38, 90.12, 12.23, 29.19};

        List<Double> studentGradesArrayList = new ArrayList<>();
        studentGradesArrayList.addAll(Arrays.asList(studentGrades));

        JavaProject.BasicJava.Student student = new Student(studentGradesArrayList);

        Double gradeAverage = student.getAverage();

        // cast to 2 dp
        BigDecimal bd = new BigDecimal(gradeAverage).setScale(2, RoundingMode.HALF_UP);
        double roundedGradeAverage = bd.doubleValue();

        Assert.assertEquals(roundedGradeAverage , 36.48, 0);

    }

}
