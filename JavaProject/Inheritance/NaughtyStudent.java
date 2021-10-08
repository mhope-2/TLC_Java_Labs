package JavaProject.Inheritance;

import JavaProject.BasicJava.Student;

import java.util.List;

public class NaughtyStudent extends Student {

    public NaughtyStudent(List<Double> studentGrades) {
        super(studentGrades);
    }

    @Override
    public Double getAverage() {
        return super.getAverage() + (super.getAverage() * 10/100);
    }
}
