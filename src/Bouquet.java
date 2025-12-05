public class Bouquet {
    private String theme;
    private Flower flower;
    private int numOfFlowers;

    public Bouquet(String theme , Flower flower , int numOfFlowers){
        this.theme = theme;
        this.flower = flower ;
        this.numOfFlowers = numOfFlowers;

    }

    public String getTheme(){
        return theme;
    }
    public Flower getFlower(){
        return flower;
    }
    public int getNumOfFlowers(){
        return numOfFlowers;
    }
    public void setTheme(String theme){
        this.theme = theme;
    }
    public void setFlower(Flower flower){
        this.flower = flower;
    }
    public void setNumOfFlowers(int numOfFlowers){
        this.numOfFlowers = numOfFlowers;
    }
    public double getCost(){
        return flower.getUnitPrice() * numOfFlowers;

    }

}
