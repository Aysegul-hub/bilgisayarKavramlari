public class GameCharacterTestClass {
    public static void main(String [] args){

        GameCharacter person1 = new GameCharacter("AysegulWarrior" , 1,100);

        System.out.println(" Initial info :");
        System.out.println(person1.getInfo());

        person1.takeDamage(30);
        System.out.println("\nAfter taking 30 damages :  ");
        System.out.println(person1.getInfo());

        person1.heal(10);
        System.out.println("\n After taking 10 heals:  ");
        System.out.println(person1.getInfo());

        System.out.println("Current person info:");
        System.out.println("Current heal :" + person1.getHealth() + " Current level : " + person1.getLevel());

        System.out.println(person1.getInfo());


        GameCharacter person2 = new GameCharacter("MageWarrior" , 3,80);
        System.out.println(" \nSecond character was created : ");
        System.out.println(person2.getInfo());

        System.out.println("\nTotal characters created : " + GameCharacter.getTotalCharacters());








    }
}
