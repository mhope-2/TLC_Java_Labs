package JavaProject.BasicJava;

import JavaProject.AbstractTypes.Nameable;

import java.util.List;

public class Student implements Nameable {

    private List<Double> studentGrades;
    private String name;

    public Student(List<Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public Student(String name, List<Double> studentGrades) {
        this.name = name;
        this.studentGrades = studentGrades;
    }

    public Double getAverage(){

        Double totalGrades = 0.00;

        for (Double grade : this.studentGrades){
            totalGrades += grade;
        }
        return totalGrades /this.studentGrades.size();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
