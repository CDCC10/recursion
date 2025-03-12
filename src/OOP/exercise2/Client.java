package OOP.exercise2;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public Complaint createComplaint(String content) {
        return new Complaint(name, content);
    }
}
