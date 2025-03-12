package OOP.exercise6;

import java.util.ArrayList;

public class Collection {
    private ArrayList<Comparable> data;

    public Collection() {
        data = new ArrayList<>();
    }

    public int size() {
        return data.size();
    }

    public Comparable data(int index) {
        return data.get(index);
    }

    public void add(Comparable data) {
        this.data.add(data);
    }

    public Comparable search(Seeker seeker, Comparable data) {
        return seeker.search(this, data);
    }
}
