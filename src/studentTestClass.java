public class studentTestClass {

    String name ;
    int age;
    boolean isJunior;
    char gender;

    public studentTestClass(){

        name ="-";
        age = 0;
        isJunior = false;
        gender = 'M';

    }

    public void info(){
        System.out.println("Name :" + name);
        System.out.println("Age : " + age);
        System.out.println("isJunior .  " + isJunior);
        System.out.println("Gender :  " + gender);
        System.out.println("---------------------");

    }
}
