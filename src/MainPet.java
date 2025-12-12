public class MainPet {
        public static void main(String[] args) {

            Dog d1 = new Dog("Lassie", 3, true, "Brown", "poddle");
            Dog d2 = new Dog(2, false, "White", "Husky");

            System.out.println(d1);
            d1.speak();
            System.out.println("Human age of d1: " + d1.getHumanAge());

            System.out.println("\n" + d2);
            d2.beAdopted("Aysegul", "Pamuk");
            System.out.println("After adoption: " + d2 + " " + d1);
            d2.speak();
        }
    }

