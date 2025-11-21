public class TestCat {
    public static void main(String[] aregs){

        Cat c1 = new Cat();
        Cat c2 = new Cat(5,45,"Lucy");
        c1.move();
        c2.move2(20);
        System.out.println("------CAT1------");
        c1.status();

        System.out.println("------CAT2------");
        c2.status();

    }
}
