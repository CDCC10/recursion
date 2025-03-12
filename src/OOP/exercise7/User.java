package OOP.exercise7;

import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<String> history = new ArrayList<>();
    private String currentLastCategory;

    public User(String name) {
        this.name = name;
        currentLastCategory = null;
    }

    public ArrayList<String> getHistory() {
        return history;
    }

    public String getCurrentLastCategory() {
        return currentLastCategory;
    }

    public void updateLastCategory(String category) {
        currentLastCategory = category;
    }

    public String getName() {
        return name;
    }
}
