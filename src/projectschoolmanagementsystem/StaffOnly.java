package projectschoolmanagementsystem;

public class StaffOnly extends Person {
    private String department;
    private String position;

    public StaffOnly(String name, int age, Address address, String department, String position) {
        super(name, age, address);
        this.department = department;
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void performTask(String task) {
        System.out.println(getName() + " is performing task: " + task);
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Position: " + position;
    }
}
