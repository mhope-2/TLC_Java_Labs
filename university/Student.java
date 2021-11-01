package university;

import java.util.Collection;

public class Student  {
    private String name;
    private String studentID;
    private Year year;

    public Student(String name, String studentID, Year year) {
        this.name = name;
        this.studentID = studentID;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
}
