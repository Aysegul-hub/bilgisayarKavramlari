// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) throws InterruptedException {

            Room guestRoom = new Room("guest room", 3, 40.0);
            Building blueHotel = new Building("Blue Hotel", guestRoom, 10, 50);
            System.out.println("Toplam Alan (m2): " + blueHotel.getTotalArea());

            Owner o1 = new Owner("Ayşe", "05335554433");
            Thread.sleep(1000); // küçük gecikme, tarihleri farklı görebilmek için
            Owner o2 = new Owner("Mehmet", "05556667788");

            Owner[] owners = { o1, o2 };

            Owner[] ownerList = new Owner[0];
            Building hotelXYZ = new Building(
                    "Hotel XYZ",
                    guestRoom,     // room: use the room created earlier
                    25,            // number of rooms
                    ownerList      // owners: ownerList array
            );

            // Display all owners
            System.out.println("Owners of Hotel XYZ:");
            hotelXYZ.displayAllOwners();
            System.out.println();


            // -------------------------------------------------
            // Display name + date of FIRST owner
            // -------------------------------------------------
            System.out.println("First owner info:");
            System.out.println("Name: " + ownerList[0].getName());
            System.out.println("Date: " + ownerList[0].getDate());
            System.out.println();


            // -------------------------------------------------
            // Call getOwners() and store elements in a NEW ARRAY
            // -------------------------------------------------
            Owner[] newArray = hotelXYZ.getOwners();

            // -------------------------------------------------
            // Using the new array: display second owner's name + date
            // -------------------------------------------------
            System.out.println("Second owner info (from new array):");
            System.out.println("Name: " + newArray[1].getName());
            System.out.println("Date: " + newArray[1].getDate());
        }
}





