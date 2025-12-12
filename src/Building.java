import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Building {

    private String name;
    private Room roomType;
    private int numOfRooms;
    private Owner[] owners;


    public Building(String name, Room roomType , int ofRooms, int numOfRooms ){
        this.name = name;
        this.roomType = roomType;
        this.numOfRooms = numOfRooms;
    }
    public Building(String name,Room roomType , int numOfRooms , Owner[] owners){
        this.name = name;
        this.roomType = roomType;
        this.numOfRooms = numOfRooms;
        this.owners = owners;


    }

        // Getters
        public String getName() { return name; }
        public Room getRoomType() { return roomType; }
        public int getNumOfRooms() { return numOfRooms; }
        public Owner[] getOwners() { return owners.clone(); }

        // Setters
        public void setName(String name) { this.name = name; }
        public void setRoomType(Room roomType) { this.roomType = roomType; }
        public void setNumOfRooms(int numOfRooms) { this.numOfRooms = numOfRooms; }
        public void setOwners(Owner[] owners) { this.owners = owners.clone(); }

        // Total area: number of rooms * area of a single room
        public double getTotalArea() {
            if (roomType == null) return 0;
            return roomType.getSizeM2() * numOfRooms;
        }

        // Print all owners (name + registration date)
        public void displayAllOwners() {
            if (owners.length == 0) {
                System.out.println("No owners for building: " + name);
                return;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("Owners of " + name + ":");

            for (Owner o : owners) {
                System.out.println(" - " + o.getName() + " (registered: " + sdf.format(o.getDate()) + ")");
            }
        }

        @Override
        public String toString() {
            return "Building{name='" + name + "', roomType=" + roomType +
                    ", numOfRooms=" + numOfRooms +
                    ", owners=" + Arrays.toString(owners) + "}";
        }
    }


