package OOP.exercise4;

public class Control {
    public static void main(String[] args) {
        TransferCompany transferCompany = new TransferCompany();
        Taxi taxi1 = new Taxi("Red1");
        Taxi taxi2 = new Taxi("Blue1");
        Taxi taxi3 = new Taxi("Orange1");
        Bus bus1 = new Bus();
        transferCompany.addVehicle(taxi1);
        transferCompany.addVehicle(taxi2);
        transferCompany.addVehicle(taxi3);
        transferCompany.addVehicle(bus1);
    }
}
