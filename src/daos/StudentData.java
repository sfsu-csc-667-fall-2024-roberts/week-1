package daos;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
    private String firstName;
    private String middleName;
    private String lastName;
    private String major;
    private List<CourseData> courses;

    public StudentData(String firstName, String middleName, String lastName, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.major = major;
        this.courses = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getMajor() {
        return this.major;
    }

    public void addCourse(CourseData course) {
        this.courses.add(course);
    }

    public List<CourseData> getCourses() {
        return courses;
    }
}
