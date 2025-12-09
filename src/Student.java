import java.util.ArrayList;
import java.util.List;

public class Student {

    private static int studentCounter = 1000;

    private final int studentId;
    private String name;
    private String address;
    private int age;
    private boolean junior;
    private char gender;
    private final List<String> courses;
    private final List<Integer> grades;

    public Student() {
        this("Unnamed", 0, false, 'U', "");
    }

    public Student(String name, String address) {
        this(name, 0, false, 'U', address);
    }

    public Student(String name, int age, boolean isJunior, char gender) {
        this(name, age, isJunior, gender, "");
    }

    public Student(String name, int age, boolean isJunior, char gender, String address) {
        this.studentId = ++studentCounter;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
        setName(name);
        setAddress(address);
        setAge(age);
        this.junior = isJunior;
        this.gender = normalizeGender(gender);
    }

    private char normalizeGender(char gender) {
        char upper = Character.toUpperCase(gender);
        return upper == 'M' || upper == 'F' ? upper : 'U';
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public boolean isJunior() {
        return junior;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = (name == null || name.isBlank()) ? "Unnamed" : name.trim();
    }

    public void setAddress(String address) {
        this.address = address == null ? "" : address.trim();
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public void setJunior(boolean junior) {
        this.junior = junior;
    }

    public void setGender(char gender) {
        this.gender = normalizeGender(gender);
    }

    public void addCourseGrade(String courseCode, int grade) {
        if (courseCode == null || courseCode.isBlank()) {
            System.err.println("Course code cannot be empty.");
            return;
        }
        if (grade < 0 || grade > 100) {
            System.err.println("Grade must be between 0 and 100.");
            return;
        }

        int existingIndex = courses.indexOf(courseCode);
        if (existingIndex >= 0) {
            grades.set(existingIndex, grade);
        } else {
            courses.add(courseCode);
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
        return "Student{id=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", junior=" + junior +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", courses=" + courses.size() +
                '}';
    }
}
