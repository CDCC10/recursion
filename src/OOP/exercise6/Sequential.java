package OOP.exercise6;

public class Sequential extends Seeker {
    @Override
    public Comparable search(Collection collection, Comparable data) {
        Comparable result = null;
        int quantity = collection.size();
        int position = 0;
        boolean found = false;
        while (position < quantity && !found) {
            if (collection.data(position).compareTo(data) == 0) {
                result = collection.data(position);
                found = !found;
            }
            position++;
        }
        return result;
    }
}
