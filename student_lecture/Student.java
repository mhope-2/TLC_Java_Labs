package student_lecture;

import java.util.List;

public class Student {
    private List<Double> studentGrades;

    public Student(List<Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public List<Double> getStudentGrades() {
        return studentGrades;
    }

    public Double getAverage(){

        Double totalGrades = 0.00;

        for (Double grade : this.studentGrades){
            totalGrades += grade;
        }
        return totalGrades /this.studentGrades.size();
    }

}
