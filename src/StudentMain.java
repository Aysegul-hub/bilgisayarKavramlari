public class StudentMain {
    public static void main(String[] args) {

        System.out.println("=== STUDENT SYSTEM TEST ===\n");

        // Yeni öğrenci oluştur
        Student s1 = new Student("Ayşegül Delialioğlu", "Istanbul");

        System.out.println("Student Created:");
        System.out.println(s1);

        // Ders ve not ekleme
        System.out.println("\nAdding courses & grades...\n");
        s1.addCourseGrade("SENG201", 85);
        s1.addCourseGrade("CENG101", 92);
        s1.addCourseGrade("PHYS101", 74);

        // Tüm dersleri yazdırma
        System.out.println("Courses & Grades:");
        s1.printGrades();



        // Yeni bir öğrenci daha oluşturalım
        Student s2 = new Student("Dua Lipa", "Los Angelas");

        System.out.println("\n\nStudent Created:");
        System.out.println(s2);

        s2.addCourseGrade("MATH101", 100);
        s2.addCourseGrade("CENG102", 78);

        System.out.println("\nCourses & Grades:");
        s2.printGrades();



        System.out.println("\n=== END OF TEST ===");
        }
    }
