package exercise5;

public class ClassRoom {
    private int capacity = 100;
    private char name;

    public ClassRoom(char character) {
        this.name = character;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " " + capacity + " available.";
    }
}
