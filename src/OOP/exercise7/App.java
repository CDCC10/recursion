package OOP.exercise7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Content recommendation systems have become very popular in recent years. These include product recommendations
 * for online stores, movies, videos, music, books, etc. To make recommendations, the system analyzes and processes
 * historical user information.
 * The challenge is to manage television series (free selection, similar to Netflix) and make recommendations
 * based on user feedback through an app. Each time users watch a series, the system records the series viewed in
 * the user's history so it can make recommendations the next time they access the app.
 * For each series, the title and category (action, comedy, documentary, etc.) are recorded.
 * In the first stage of the project, the recommended series belong to the same category as the last series viewed.
 * For example: If you have a list of series available in the App:
 * Big Bang         ->  Comedy
 * The Secret Files -> Thriller
 * Breaking Bad     -> Drama
 * Game of Thrones  -> Drama
 * Supernatural     -> Horror
 * Friends          -> Comedy
 * Narcos           -> Drama
 * If the last series the user watched was Game of Thrones, the system will recommend all the series they have
 * registered in the Drama category, for example: Breaking Bad, Narcos, etc.
 */
public class App {
    private Map<String, User> users = new HashMap<>();
    private ArrayList<Serie> series = new ArrayList<>();

    public App() {}

    public void addCustomer(User user) {
        users.put(user.getName(), user);
    }

    public void addSeries(Serie serie) {
        series.add(serie);
    }

    public void updateUserHistory(User user, Serie serie) {
        if (users.containsKey(user.getName())) {
            users.get(user.getName()).updateLastCategory(serie.getCategory());
        }
    }

    public ArrayList<Serie> recommendSeries(String user) {
        ArrayList<Serie> recommendedSeries = new ArrayList<>();
        if (users.containsKey(user)) {
            if (users.get(user).getCurrentLastCategory() != null) {
                String lastCategory = users.get(user).getCurrentLastCategory();
                for (Serie serie : series) {
                    if (serie.getCategory().equals(lastCategory)) {
                        recommendedSeries.add(serie);
                    }
                }
            } else {
                return series;
            }
        }
        return recommendedSeries;
    }
}
