public class Dog extends Pet{
    private String color;
    private String breed;

    public Dog (String name , int age , boolean isMale, String color, String breed){
        super(name,age,isMale);
        this.color = color;
        this.breed = breed;
    }

    public Dog(int age, boolean isMale,String color, String breed){
        super(age , isMale);
        this.color = color;
        this.breed= breed;
    }

    public void speak() {
        System.out.println("Woof woof !");
    }
    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Köpek yaşını insan yaşına çevirme (basit yöntem: age * 7)
    public int getHumanAge() {
        return getAge() * 7;
    }

    @Override
    public String toString() {
        return "Dog{name='" + getName() + "', owner='" + (hasOwner() ? "Has owner" : "No owner") +
                "', age=" + getAge() + ", isMale=" + getIsMale() +
                ", color='" + color + "', breed='" + breed + "'}";
    }
}


