public class Pet {

    //Fields
    private String name;
    private String owner;
    private int age;
    private boolean isMale;

    public Pet(String name, int age, boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.owner = null;
    }

    public Pet(int age, boolean isMale){
        this.name = null;
        this.age = age;
        this.isMale = isMale;
        this.owner = null;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;

    }
    public boolean getIsMale(){
        return isMale;
    }
    public void beAdopted(String owner, String name){
        if ( !isNullOrEmpty(owner) && !isNullOrEmpty(name)){
            this.owner = owner;
            this.name = name;
        }
    }
    protected boolean isNullOrEmpty(String s){
        return (s == null || s.equals(""));
    }
    protected boolean hasOwner(){
        return !isNullOrEmpty(owner);
    }
    public void changeName(String name){
        if (!isNullOrEmpty(name)){
            this.name = name;
        }
    }

    public String toString() {
        return "Pet{name = '" + name + "' , owner = '" + owner + "' , age = " + age + ", isMale = " + isMale + "}";
    }
}
