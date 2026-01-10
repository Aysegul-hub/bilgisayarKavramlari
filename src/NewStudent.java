import java.util.ArrayList;
import java.util.List;

public class NewStudent {
    private static int studentCounter = 2000;

    private final int stuId;
    private String name;
    private String address;
    private final List<String> courses;
    private final List<Integer> grades;

    public NewStudent() {
        this("Unnamed", "");
    }

    public NewStudent(String name, String address) {
        this.stuId = ++studentCounter;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
        setName(name);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getStuId() {
        return stuId;
    }

    public void setAddress(String address) {
        this.address = address == null ? "" : address.trim();
    }

    public void setName(String name) {
        this.name = (name == null || name.isBlank()) ? "Unnamed" : name.trim();
    }

    public void addCourseGrade(String course, int grade) {
        if (course == null || course.isBlank()) {
            System.err.println("Course name cannot be empty.");
            return;
        }
        if (grade < 0 || grade > 100) {
            System.err.println("Grade must be between 0 and 100.");
            return;
        }

        int idx = courses.indexOf(course);
        if (idx >= 0) {
            grades.set(idx, grade);
        } else {
            courses.add(course);
            grades.add(grade);
        }
    }

    public void printGrades() {
        if (courses.isEmpty()) {
            System.out.println("No courses recorded for " + name + ".");
            return;
        }

        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i) + " : " + grades.get(i));
        }
        System.out.printf("Average grade: %.2f%n", getAverageGrade());
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "NewStudent{id=" + stuId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", courses=" + courses.size() +
                '}';
    }
}
