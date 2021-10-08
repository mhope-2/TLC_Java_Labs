package JavaProject.BasicJava;

import org.junit.Test;

import java.util.List;

public class Lecture {

    private Student student;

    public Lecture() {
    }

    public Lecture(Student student) {
        this.student = student;
    }

    public void enter(Student student){
        this.student = student;
    }

    public Double getHighestAverageGrade(List<Student> studentGrades){
        Double highestAverageGrade = 0.00;

        for (Student stud : studentGrades){
            if (stud.getAverage() > highestAverageGrade){
                highestAverageGrade = stud.getAverage();
            }
        }
        return highestAverageGrade;
    }



}
