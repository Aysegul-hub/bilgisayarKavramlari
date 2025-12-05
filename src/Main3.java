import java.util.Date;
public class Main3 { //Homework class's test class
    public static void main(String [] args){
        Date date = new Date();
        Homework hw = new Homework("Seng 211- OOP ", "Prepare a slide about Array vs ArrayList and Date class", date);
        hw.printInfo();
        Homework hw2 = new Homework("Biology 101 - Cells", " The cells missions and cell shapes", date);
        hw2.printInfo();



    }
}
