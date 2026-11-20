package associationAggregationComposition.composition;

import java.util.ArrayList;
import java.util.List;

/**
 * Composition: a House owns its Rooms. The Rooms are created by the House
 * and are not exposed as independently created objects in this example.
 */
public class Composition {
    public static void main(String[] args) {
        House house = new House();
        house.addRoom("Bedroom");
        house.addRoom("Kitchen");

        System.out.println("House rooms: " + house.getRooms());

        // When the House is no longer reachable, its owned Rooms are also
        // eligible for garbage collection.
        house = null;
    }

    private static class House {
        private final List<Room> rooms = new ArrayList<>();

        private void addRoom(String name) {
            rooms.add(new Room(name));
        }

        private List<Room> getRooms() {
            return rooms;
        }
    }

    private record Room(String name) {
        @Override
        public String toString() {
            return name;
        }
    }
}
