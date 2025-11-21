public class TestPerson {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person("Aysegul",21,345);

        System.out.println(p1);
        System.out.println(" Age " + p2.getAge() + " ID " + p2.getId() + " Name " + p2.getName());
        System.out.println("Current counter : " + Person.getIdCounter());





    }
}
