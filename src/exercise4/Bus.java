package exercise4;

import java.util.ArrayList;

public class Bus implements Vehicle {
    private String name;
    private String route;
    private int basicTicketCost;
    private int money;
    private ArrayList<Passenger> passangers = new ArrayList<>();

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public void collectMoney(int money) {
        this.money += money;
    }
}
