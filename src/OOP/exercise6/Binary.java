package OOP.exercise6;


public class Binary extends Seeker {

    @Override
    public Comparable search(Collection collection, Comparable data) {
        Comparable result = null;
        int left = 0, right = collection.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (collection.data(mid).compareTo(data) == 0) {
                return collection.data(mid);
            } else if (collection.data(mid).compareTo(data) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
