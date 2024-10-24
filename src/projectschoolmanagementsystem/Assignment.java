package projectschoolmanagementsystem;
import java.io.Serializable;

public class Assignment {
    private static final long SerialVersionUID = 1L;
    private String assignmentName;

    public Assignment(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String getAssignmentName() {
        return assignmentName;
    }
}
