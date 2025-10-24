// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){
      /*  StaticLifetime obj1 = new StaticLifetime();
        StaticLifetime obj2 = new StaticLifetime();

        obj1.incrementCounter();
        obj2.incrementCounter();*/


        Book book1 = new Book();
        Book book2 = new Book("Java 101", "James Gosling", 150.0);
        book1.showDetails();
        book2.showDetails();


        Student student1 = new Student();




        Student student2 = new Student("Aysegul",20,true,'F');
        Student student3 = new Student("Abdullah", 22,false, 'M');

        student1.info();
        student2.info();
        student3.info();


        Student s1 = new Student();
        System.out.println("Before assigning new values :");
        System.out.println("Name :" + s1.name);
        System.out.println("Age :" + s1.age);
        System.out.println("------------------");

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


    }


