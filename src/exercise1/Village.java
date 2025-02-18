package exercise1;

import java.util.ArrayList;

/**
 * In a village there are several residents who come in harmony, since they usually share the workspace
 * and places of entertainment. Juan Pablo is one of the inhabitants of this village who usually goes to
 * the "The eagles" place a lot since it has many children's games.
 */
public class Village {
    private ArrayList<Place> places;
    private Work work;
    private ArrayList<Inhabitant> inhabitants;

    public Village() {
        places = new ArrayList<>();
        work = new Work();
        inhabitants = new ArrayList<>();
    }
}
