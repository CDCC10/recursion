package exercise4;

import java.util.ArrayList;

public class Taxi implements Vehicle {
    private String name;
    private String location = "1";
    private int basicTicketCost = 10;
    private int additionalCost = 1;
    private boolean status = true;
    private int money = 0;
    private ArrayList<Passenger> passangers = new ArrayList<>();

    public Taxi(String name) {
        this.name = name;
    }

    @Override
    public int getMoney() {
        return money;
    }

    public boolean isFree() {
        return status;
    }

    @Override
    public void collectMoney(int money) {
        this.money += money;
    }
}
