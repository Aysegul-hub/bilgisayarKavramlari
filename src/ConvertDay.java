import java.util.Scanner;

public class ConvertDay {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer number: ");
        int dayNumber= scan.nextInt();

        String dayName ;

        switch(dayNumber){
            case 1 :
                dayName = "Monday";
                break;
            case 2 :
                dayName = "Tuesday";
                break;
            case 3 :
                dayName = "Wednesday";
                break;
            case 4 :
                dayName = "Thursday";
                break;
            case 5 :
                dayName = "Friday";
                break;
            case 6 :
                dayName = "Saturday";
                break;
            case 7 :
                dayName = "Sunday";
                break;
            default:
                dayName = " Invalid input , please enter a number between 1 and 7.";


        }
        System.out.println(dayName);

        scan.close();







    }
}
