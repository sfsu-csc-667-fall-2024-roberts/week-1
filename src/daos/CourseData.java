package daos;

import java.util.HashMap;
import java.util.Map;

public class CourseData implements Comparable<CourseData> {
    private int year;
    private String semester;
    private Course course;
    private String grade;
    private double gradePoints;

    private static Map<String, Double> gpaMapping = new HashMap<>();
    static {
        gpaMapping.put("A", 4.0);
        gpaMapping.put("A-", 3.7);
        gpaMapping.put("B", 3.0);
        gpaMapping.put("C", 2.0);
        gpaMapping.put("D", 1.0);
    }

    public CourseData setYear(int year) {
        this.year = year;

        return this;
    }

    public int getYear() {
        return this.year;
    }

    public CourseData setSemester(String semester) {
        this.semester = semester;

        return this;
    }

    public String getSemester() {
        return this.semester;
    }

    public CourseData setCourse(Course course) {
        this.course = course;

        return this;
    }

    public Course getCourse() {
        return this.course;
    }

    public CourseData setGrade(String grade) {
        this.grade = grade;
        this.gradePoints = gpaMapping.get(grade);

        return this;
    }

    public String getGrade() {
        return this.grade;
    }

    public double getGradePoints() {
        return this.gradePoints;
    }

    @Override
    public int compareTo(CourseData courseObject) {
         // TODO: Sort name, then semester, then year

        if (
            courseObject.course.equals(this.course) && 
            courseObject.getYear() == this.getYear() && 
            courseObject.getSemester().equals(this.getSemester())
        ) {
            return 1;
        } else if (courseObject.getYear() < this.getYear()) {
            return -1;
        }

        return 0;
    }

}
