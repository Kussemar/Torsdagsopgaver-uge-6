/*
This task i an excersice in accessing fields in objects within objects.
You will create a building with some rooms.
Each room will have some attributes which you will access(read the value of)
in order to draw conclusions about the building in which the room is placed.
 */


package Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Room r1 = new Room(2, 25, 24);
        Room r2 = new Room(1, 3, 2);
        Room r3 = new Room(2, 8, 12);
        // Add the three rooms to a collection (preferably of the same data type used for the "Rooms"
        // field in your Building.java class).
        ArrayList<Room> room = new ArrayList<>(Arrays.asList(r1, r2, r3));

        Building b1 = new Building(room, 2, 1, false); //room tæller arraylisten

// Kalder metoden b1 og ikke "b" fordi metoden er ude fra vores main metode har ikke brug for noget.
        System.out.println(countLampsInBuilding(b1));
        System.out.println(isNormal(b1));
    }

    public static int countLampsInBuilding(Building b) {
    int sum = 0;
    for(Room r:b.getRooms()){
        sum += r.getNumberOfLamps();
    }
    return sum;

    }

    public static boolean isNormal(Building b){
        int floors = b.getNumberOfFloors();
        int rooms = b.getRooms().size(); //vi er ligeglade med hvor mange rum, me nvi skal vide hvor mange rum vi skal bruge.

        if(floors > rooms) {
            System.out.println("This building is odd");
            return false;
        }
        return true;
        }
    }
