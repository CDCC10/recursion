package OOP.exercise5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Building {
    private Map<Integer, ArrayList<ClassRoom>> classRooms = new HashMap<>();
    private int classRoomCount = 20;

    public Building() {
        createClassRooms();
    }

    private void createClassRooms() {
        char character = 'A';
        for (int i = 1; i < 11; i++) {
            classRooms.computeIfAbsent(i, k -> new ArrayList<>()).add(new ClassRoom(character));
            character++;
        }
    }

    public int getNumberOfAvailableClassRooms(int capacity, int location) {
        int numberOfAvailableClassRooms = 0;
        if (classRooms.containsKey(location)) {
            for(ClassRoom classRoom : classRooms.get(location)) {
                if ( capacity <= classRoom.getCapacity()) {
                    numberOfAvailableClassRooms++;
                }
            }
        }
        return numberOfAvailableClassRooms;
    }

    public int getQuantityOfClassRooms(int location) {
        return classRooms.containsKey(location) ? classRooms.get(location).size() : 0;
    }

    public void addClassRoom(ClassRoom classRoom, int location) {
        if (classRooms.containsKey(location)) {
            classRooms.get(location).add(classRoom);
        }
    }

    public String getCapacityByLocation(int location) {
        int totalCapacity = 0;
        if (classRooms.containsKey(location)) {
            for (ClassRoom classRoom : classRooms.get(location)) {
                totalCapacity += classRoom.getCapacity();
            }
        }
        return "The total capacity is " + totalCapacity;
    }

    public int getQuantityClassRooms() {
        int totalClassRooms = 0;
        for (ArrayList<ClassRoom> classRooms : classRooms.values()) {
            totalClassRooms += classRooms.size();
        }
        return totalClassRooms;
    }

    public Map<Integer, ArrayList<ClassRoom>> getClassRooms() {
        return classRooms;
    }

    public int getClassRoomCount() {
        return classRoomCount;
    }
}
