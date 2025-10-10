public class StaticLifetime {

    static int counter = 0;

    void incrementCounter() {
        counter++;
        System.out.println(" The value of counter : " + counter);

    }


}
