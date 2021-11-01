package university;

import java.util.List;

public class Course {
    private Lecturer lecturer;
    private List<Student> students;
    private CourseYear courseYear;

    public Course(Lecturer lecturer, List<Student> students, CourseYear courseYear) {
        this.lecturer = lecturer;
        this.students = students;
        this.courseYear = courseYear;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public CourseYear getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(CourseYear courseYear) {
        this.courseYear = courseYear;
    }
}
