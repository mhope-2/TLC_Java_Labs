package JavaProject.BasicJava;

import JavaProject.AbstractTypes.Nameable;
import JavaProject.Enums.HasLevel;
import JavaProject.Enums.Level;

import java.util.List;

public class Student implements Nameable, HasLevel {

    private List<Double> studentGrades;
    private String name;
    private Level level;

    public Student(List<Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public Student(String name, List<Double> studentGrades) {
        this.name = name;
        this.studentGrades = studentGrades;
    }

    public Student(String name, List<Double> studentGrades, Level level) {
        this.name = name;
        this.studentGrades = studentGrades;
        this.level = level;
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

    public Level getLevel() {
        return level;
    }

}
