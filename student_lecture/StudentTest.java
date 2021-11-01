package student_lecture;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void checkAverageGrade(){

        Double[] studentGrades = {90.00, 67.00, 28.00, 55.00, 88.00, 99.00, 100.00};

        Student student = new Student(Arrays.asList(studentGrades));

        assertEquals(student.getAverage(), 75.2857,0);

    }

}
