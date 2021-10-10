package JavaProject.AbstractTypes;

import JavaProject.BasicJava.Student;
import JavaProject.Enums.Level;

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

        for(Nameable student : nameables){
            if (student.getLevel() == level){
                students.put(student.getLevel(), List.of((Student) student));
            }
        }

        return students;
    }


    public void printReport(){

    }

    public List<Student> sort (Comparator<Student> comparator, List<Student> students){
        Collections.sort(students, comparator);
        return students;
    }



}
