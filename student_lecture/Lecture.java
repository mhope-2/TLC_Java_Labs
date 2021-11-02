package student_lecture;

import java.util.List;

public class Lecture {

    public void enter(Student student){

    }

    public Double getHighestAverageGrade(List<? extends Student> studentGrades){
        Double highestAverageGrade = 0.00;

        for (Student stud : studentGrades){
            if (stud.getAverage() > highestAverageGrade){
                highestAverageGrade = stud.getAverage();
            }
        }
        return highestAverageGrade;
    }



}
