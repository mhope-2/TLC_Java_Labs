package JavaProject.Generics;

import JavaProject.BasicJava.Student;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {
    List<Student> bagOfStudents = new ArrayList<>();

    public void add(Student student){
        bagOfStudents.add(student);
    }

    public void remove(Student student){
        bagOfStudents.remove(student);
    }

    public void clear(){
        bagOfStudents.clear();
    }
}
