public class Student {

    String name;
    int age;
    boolean isJunior;
    char gender;

    public Student() {
        name = "-";
        age = 0;
        isJunior = false;
        gender ='M';

    }
    public Student(String name, int age, boolean isJ, char gender) {
        this.name = name;
        this.age = age;
        this.isJunior = isJunior;
        this.gender =gender;

    }

    public void info(){

        System.out.println("Name :" + name);
        System.out.println("Age : " + age);
        System.out.println("isJunior .  " + isJunior);
        System.out.println("Gender :  " + gender);

    }
}
