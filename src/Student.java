import java.util.ArrayList;
import java.util.List;

/**
 * Created by ethan on 2017-02-07.
 */
public class Student extends Person {
    String major;
    boolean fullTime;
    List<Course> courseList;

    public Student(String name, String emailAddress, String major,Boolean fullTime) {
        super(name, emailAddress);
        this.major = major;
        this.fullTime = fullTime;
    }

    public void addCourse(Course c){
        if(this.courseList == null)
            this.courseList = new ArrayList<Course>();
        this.courseList.add(c);
    }

    public String toString() {
        return String.format("Name: %s\nMajor: %s\nEmail: %s", this.name, this.major, this.emailAddress);
    }
}
