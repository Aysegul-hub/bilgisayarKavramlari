public class Student {

    String name;
    int age;
    boolean isJunior;
    char gender;

    public Student(String ayşegülDelialioğlu, String istanbul) { //parametresiz constructor
        name = "-";
        age = 0;
        isJunior = false;
        gender ='M';

    }
    public Student(String name, int age, boolean isJ, char gender) { //parametreli constructor
        this.name = name;
        this.age = age;
        this.isJunior = isJunior;
        this.gender =gender;

    }

    public void info(){ //bilgileri yazdırmak için

        System.out.println("Name :" + name);
        System.out.println("Age : " + age);
        System.out.println("isJunior .  " + isJunior);
        System.out.println("Gender :  " + gender);

    }

    public static void main(String[] args){

        Student student1 = new Student("Ayşegül Delialioğlu", "Istanbul"); // parametresiz olduğu için default döndürecek

        Student student2 = new Student("Aysegul",20,true,'F');
        Student student3 = new Student("Abdullah", 22,false, 'M');

        student1.info();
        student2.info();
        student3.info();


        Student s1 = new Student("Ayşegül Delialioğlu", "Istanbul");
        System.out.println("Before assigning new values :");
        System.out.println("Name :" + s1.name);
        System.out.println("Age :" + s1.age);
        System.out.println("------------------");

        // burda yeni value atıyoruz
        s1.name = "Ayşegül";
        s1.age = 21;
        s1.isJunior = true;
        s1.gender = 'F';


        System.out.println("After assigning new values :");
        System.out.println("Name :" + s1.name);
        System.out.println("Age :" + s1.age);
        System.out.println("------------------");

        s1.info();

    }

    public void addCourseGrade(String seng201, int i) {

    }

    public void printGrades() {
    }


}
