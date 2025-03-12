package OOP.exercise5;

public class Faculty {
    private Building[] buildings = new Building[5];

    public Faculty() {
        createBuildings();
    }

    private void createBuildings() {
        for (int i = 0; i < 5; i++) {
            buildings[i] = new Building();
        }
    }

    public String getNumberOfClassRooms() {
        int totalClassRooms = 0;
        for (Building building : buildings) {
            totalClassRooms += building.getQuantityClassRooms();
        }
        return "The total number of class rooms is " + totalClassRooms;
    }

    public boolean isAvailableToAddClassRoom() {
        for (Building building : buildings) {
            if (building.getClassRoomCount() == 0) {
                return false;
            }
        }
        return true;
    }

    public Building[] getBuildings() {
        return buildings;
    }
}
