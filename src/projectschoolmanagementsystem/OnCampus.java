package projectschoolmanagementsystem;

public class OnCampus extends Course {
    private String location; // Location of the on-campus course (e.g., Room 101, Main Building)

    public OnCampus(String courseID, String courseName, String location) {
        super(courseID, courseName);
        this.location = location;
    }

    @Override
    public void conductExam() {
        System.out.println("Conducting on-campus exam at location: " + location);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
