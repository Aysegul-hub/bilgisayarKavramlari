public class Person {
    private int id;
    private String name;
    private int age;
    private static int idCounter;


    public Person() {

        this.id = 0;
        this.name = " ";
        this.age= 0;
        idCounter++;
    }
    public Person(String name, int age , int id){

        this.id = id;
        this.name = name;
        this.age= age;
        idCounter++;

    }
    public int getId(){
        return id;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static int getIdCounter(){
        return idCounter;

    }

    public void setName(String name){
        this.name = name;

    }
    public void setAge(int age){
        this.age = age;

    }
}
