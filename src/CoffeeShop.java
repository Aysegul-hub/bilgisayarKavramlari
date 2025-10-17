import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args){

        Scanner scans = new Scanner(System.in);

        System.out.println("Hello , Welcome to our coffee shop!");
        System.out.println("Menu: ");
        System.out.println("A- Americano : $3.00 ");
        System.out.println("C- Cappuccino : $3.75 ");
        System.out.println("L- Latte : $4.00 ");
        System.out.println("E- Espresso : $2.50 ");
        System.out.println("Please enter A,C,L or E :");

        String coffee = scans.nextLine().toUpperCase();

        switch(coffee){
            case "A" :
                System.out.println("Americano costs $3.00");
                break;
            case "C" :
                System.out.println("Cappuccino costsw $3.75");
                break;
            case "L":
                System.out.println("Latte costs $4.00");
                break;
            case "E":
                System.out.println("Espresso costs $2.50");
                break;
            default :
                System.out.println("Invalid Letter!");


        }
        scans.close();


    }
}
