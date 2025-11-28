
import java.util.Random;

public class GameCharacter {
    private int characterId ;
    private String name;
    private int level;
    private int health;
    private static int totalCharacters = 0;

    public GameCharacter(String name , int level , int health){
        Random rand = new Random();
        this.characterId = 1000+ rand.nextInt(8001); //[ 1000-9000]
        this.name = name;
        this.level = level;
        this.health = health;
        totalCharacters++;

    }
    public int getCharacterId(){return characterId;}
    public String getName(){return name;}
    public int getLevel() {return level;}
    public int getHealth(){return health;}
    public static int getTotalCharacters(){return totalCharacters;}
    public void takeDamage(int damage){
        health -= damage;
        if(health<0) {
            health = 0;
        }
    }
    public void heal(int amount ){health += amount;}
    public String getInfo(){
        return "Character ID : " + characterId + " Name : " + name + " Level : " + level + " Health : " + health + "Total Characters : " + totalCharacters;

    }
}


