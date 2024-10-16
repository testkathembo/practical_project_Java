package projectschoolmanagementsystem;

public class Online extends Course {
    private String platform; // Platform used for the online course (e.g: Zoom, Moodle, Teams)

    public Online(String courseID, String courseName, String platform) {
        super(courseID, courseName);
        this.platform = platform;
    }

    @Override
    public void conductExam() {
        System.out.println("Conducting online exam on platform: " + platform);
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
