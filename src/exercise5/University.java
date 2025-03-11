package exercise5;

import java.util.ArrayList;
import java.util.Map;


/**
 * We want to have information about the rooms that are used to teach classes at the FCYT. We are interested in the
 * capacity of the rooms and the vertical location refers to the floor on which a room is located.
 * We need to know:
 *  - How many rooms exist with a capacity greater than X and that are in location U
 *  - How many rooms exist in location X
 *  - Issue a report of all the rooms that a faculty has
 *  - Issue a report of the first n rooms that have a minimum capacity of X
 *  - Indicate if it is possible to add one more room to a faculty
 *  - Allow the entry of one more new room
 *  - Make a report that indicates the sum of all the capacities by location
 */
public class University {
    private Faculty[] faculties;

    public University() {
        faculties = new Faculty[5];
    }

    private void createFaculties() {
        for (int i = 0; i < 5; i++) {
            faculties[i] = new Faculty();
        }
    }

    public String getFreeClassRooms(int quantity, int capacity) {
        ArrayList<String> reports = new ArrayList<>();
        for (Faculty faculty : faculties) {
            Building[] buildings = faculty.getBuildings();
            for (Building building : buildings) {
                Map<Integer, ArrayList<ClassRoom>> classRooms = building.getClassRooms();
                for (ArrayList<ClassRoom> classRoomsFromBuilding : classRooms.values()) {
                    for (ClassRoom classRoomToVerify : classRoomsFromBuilding) {
                        if (capacity <= classRoomToVerify.getCapacity()) {
                            String report = classRoomToVerify.toString();
                            reports.add(report);
                        }
                    }
                }
            }
        }
        return String.join(" ", reports.subList(0, quantity));
    }
}
