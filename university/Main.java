package university;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Max Bay", "001", Year.FIRST);
        Student student2 = new Student("Kaly Jay", "001", Year.SECOND);
        Student student3 = new Student("Luke Kay", "001", Year.FIRST);
        Student student4 = new Student("Jack Ma", "001", Year.THIRD);
        Student student5 = new Student("Ui Max", "001", Year.FOURTH);
        Student student6 = new Student("Dennis Ritchie", "001", Year.FIRST);
        Student student7 = new Student("Jacob Sam", "001", Year.SECOND);
        Student student8 = new Student("Kris Yu", "001", Year.FIRST);
        Student student9 = new Student("Sally Wu", "001", Year.THIRD);
        Student student10 = new Student("Ai Wu", "001", Year.FOURTH);

        // list of students taking intro to programming
        List<Student> allStudents = List.of(student1, student2, student3, student4,
                student5, student6, student7, student8, student9, student10);

        // filtering 1st year students
        List<Student> introToProgrammingStudents = allStudents.stream().filter(
                student -> student.getYear() == Year.FIRST
        ).collect(Collectors.toList());


        // create intro to programming course
        Lecturer introToProgrammingLecturer = new Lecturer("Jack Dorsey", Subject.PROGRAMMING);

        // create intro to programming course
        Course introToProgramming = new Course(introToProgrammingLecturer, introToProgrammingStudents, CourseYear.FIRST);

        System.out.println("All Intro to Programming Students");
        printStudents(introToProgrammingStudents);
        System.out.println();


        // create physics lecturer
        Lecturer physicsLecturer = new Lecturer("Jim Say", Subject.PHYSICS);

        // filtering 4th year students with name starting with a vowel
        List<Student> physicsStudents = allStudents.stream().filter(
                        student -> student.getYear() == Year.FOURTH
                ).filter(student -> student.getName().charAt(0) == 'A' || student.getName().charAt(0) == 'E' ||
                        student.getName().charAt(0) == 'I' || student.getName().charAt(0) == 'O' ||
                        student.getName().charAt(0) == 'U')
                .collect(Collectors.toList());

        // create intro to programming course
        Course physicsCourse = new Course(physicsLecturer, physicsStudents, CourseYear.FOURTH);

        System.out.println("All Physics Students");
        printStudents(physicsStudents);
        System.out.println();

       //
        // create an advanced gardening lecturer
        Lecturer advancedGardeningLecturer = new Lecturer("Kim Say", Subject.GARDENING);

        List<Student> advancedGardeningStudents = allStudents.stream()
                .filter(student -> student.getYear() == Year.THIRD || student.getYear() == Year.FOURTH)
                .collect(Collectors.toList());

        AdvancedGardeningCourse advancedGardeningCourse = new AdvancedGardeningCourse(advancedGardeningLecturer,
                advancedGardeningStudents, CourseYear.FOURTH);
        System.out.println("All Advanced Gardening Students");
        printStudents(advancedGardeningStudents);

    }

    public static void printStudents(List<Student> listOfStudents){
        for (Student student: listOfStudents){
            System.out.println(student.getName());
        }
    }

}
