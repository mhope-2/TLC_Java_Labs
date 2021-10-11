package JavaProject.AbstractTypes;

import JavaProject.BasicJava.Student;
import JavaProject.Enums.Level;
import JavaProject.Exceptions.StudentNotFoundException;

import java.util.*;
import java.util.stream.Collectors;

public class Register {

    private List<Student> nameables;

    public Register(List<Student> nameables) {
        this.nameables = nameables;
    }

    public List<String> getRegister(){

        return this.nameables.stream()
                .map(nameable -> Nameable.toString(nameable))
                .collect(Collectors.toList());
    }

    public List<String> getRegisterByLevel(Level level){

        List<String> studentNames = new ArrayList<>();

        for(Nameable student : nameables){
            if (student.getLevel() == level){
                studentNames.add(student.getName());
            }
        }

        return studentNames;
    }

    public Map<Level, List<Student>> getRegisterByLevel2(Level level){

        Map<Level, List<Student>> students = new HashMap<>();

        for(Student student : nameables){
            if (student.getLevel() == level){
                students.put(student.getLevel(), List.of(student));
            }
        }

        return students;
    }


    public void printReport(){

    }

    public List<Student> sort (Comparator<Student> comparator, List<Student> students){
        students.sort(comparator);
        return students;
    }

    public String returnStudentByName(Student student) throws StudentNotFoundException {
         if(this.nameables.contains(student)){
             return student.getName();
         }
         else {
             throw new StudentNotFoundException(student.getName() + "not found in register!");
         }
    }

    public List<List<Double>> returnGradesAsADoubleStream(){
        return this.nameables.stream()
                .map(Student::getStudentGrades)
                .collect(Collectors.toList());
    }

    public List<Double> returnHighestOfAllStudentsGrades(){

        List<Double> highestGrades = new ArrayList<>();

        for (Student student: this.nameables){
            highestGrades.add(student.getStudentGrades().stream()
                    .max(Double::compare)
                    .get());
        }

        return highestGrades;
    }

}
