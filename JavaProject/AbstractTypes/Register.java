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
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public List<String> getRegisterByLevel(Level level){

        return this.nameables.stream()
                .filter(student -> student.getLevel() == level)
                .map(Student::getName)
                .collect(Collectors.toList());
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

    public Optional<Student> getStudentByName(String studentName){
        return this.nameables.stream()
                .filter(student -> student.getName().equals(studentName))
                .findFirst();
    }

    public List<Student> getStudentsByName(List<String> names){

        return this.nameables.stream()
                .filter(student -> names.contains(student.getName()))
                .collect(Collectors.toList());
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

    public Double returnHighestOfAllStudentsGrades(Student student){

        return student.getStudentGrades().stream()
                .max(Double::compare)
                .get();
    }

    public List<List<Double>> gradesAboveSixty(){

        return this.nameables.stream()
                .filter(student -> student.getAverage() > 60.00)
                .map(Student::getStudentGrades)
                .toList();
    }


}
