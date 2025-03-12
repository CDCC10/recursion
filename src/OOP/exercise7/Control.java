package OOP.exercise7;

import java.util.ArrayList;

public class Control {
    public static void main(String[] args) {
        App app = new App();
        User user1 = new User("Carlos");
        Serie serie1 = new Serie("Big Ban", "Comedy");
        Serie serie2 = new Serie("Secret Files", "Suspense");
        Serie serie3 = new Serie("Breaking Bad", "Drama");
        Serie serie4 = new Serie("Game of Thrones", "Drama");
        Serie serie5 = new Serie("Supernatural", "Horror");
        Serie serie6 = new Serie("Friends", "Comedy");

        app.addCustomer(user1);
        app.addSeries(serie1);
        app.addSeries(serie2);
        app.addSeries(serie3);
        app.addSeries(serie4);
        app.addSeries(serie5);
        app.addSeries(serie6);
        app.updateUserHistory(user1, serie1);

        ArrayList<Serie> recommended = app.recommendSeries(user1.getName());
        for (Serie serie : recommended) {
            System.out.println(serie.getTitle() + " " + serie.getCategory());
        }
    }
}
