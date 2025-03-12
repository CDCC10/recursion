package OOP.exercise6;

public class BoundedSequential extends Seeker {
    public BoundedSequential() {}

    @Override
    public Comparable search(Collection collection, Comparable data) {
        int quantity = collection.size();
        int position = 0;
        while (position < quantity) {
            if (collection.data(position).compareTo(data) == 0) {
                return collection.data(position);
            }
            position++;
        }
        return null;

    }
}
