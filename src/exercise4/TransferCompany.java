package exercise4;


import java.util.ArrayList;

/**
 * Transfer is a public transportation company that has a fleet of taxis and a
 * variety of bus lines. Taxis have a name that identifies them (for example, Red 100),
 * a current location, the basic fare cost, the additional cost per person, the status
 * (busy/free) and the daily collection. The name of the bus line, the route, the basic
 * fare cost and the daily collection are known. Buses, because they have a single cost,
 * pick up passenger one at a time, but taxis can pick up one or more passengers. Vehicles
 * should be able to indicate whether they can take a passenger from X to Y. The route is
 * considered as an ordered sequence of places that can be visited.
 * The company wants to automate some of its processes, which are detailed below:
 *  - It is required to know the company's travel expenses
 *  - It is required to know the list of vehicles that can take people from place X to Y
 *  - It is desired to automate passenger pick-up
 */
public class TransferCompany {
    private ArrayList<Taxi> taxis;
    private ArrayList<Bus> buses;

    public TransferCompany() {
        taxis = new ArrayList<>();
        buses = new ArrayList<>();
    }

    public int calculateDailyEarning() {
        return calculateTotal(taxis) + calculateTotal(buses);
    }

    public void addVehicle(Vehicle vehicle ) {
        if (vehicle instanceof Taxi) {
            taxis.add((Taxi) vehicle);
        } else if (vehicle instanceof Bus) {
            buses.add((Bus) vehicle);
        }
    }

    public ArrayList<Taxi> getFreeTaxis() {
        ArrayList<Taxi> free = new ArrayList<>();
        for (Taxi taxi: taxis) {
            if(taxi.isFree()) {
                free.add(taxi);
            }
        }
        return free;
    }

    private <T extends Vehicle> int calculateTotal(ArrayList<T> list) {
        int total = 0;
        for (T item: list) {
            total += item.getMoney();
        }
        return total;
    }
}
