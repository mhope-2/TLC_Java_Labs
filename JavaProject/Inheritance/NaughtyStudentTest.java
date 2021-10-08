package JavaProject.Inheritance;

import JavaProject.BasicJava.Student;
import static org.junit.Assert.*;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NaughtyStudentTest {
    @Test
    public void testKindOfStudent(){

        boolean isKindOf = false;

        if (Student.class.isAssignableFrom(NaughtyStudent.class)){
            isKindOf = true;
        }

        assertTrue(isKindOf);
    }

    @Test
    public void testNaughtyStudentScore(){
        Double[] studentGrades = {100.00, 100.00, 100.00, 100.00};

        List<Double> studentGradesArrayList = new ArrayList<>();
        studentGradesArrayList.addAll(Arrays.asList(studentGrades));

        NaughtyStudent naughtyStudent = new NaughtyStudent(studentGradesArrayList);

        Double gradeAverage = naughtyStudent.getAverage();

        // cast to 2 dp
        BigDecimal bd = new BigDecimal(gradeAverage).setScale(2, RoundingMode.HALF_UP);
        double roundedGradeAverage = bd.doubleValue();

        assertEquals(roundedGradeAverage , 110.00, 0);
    }
}
