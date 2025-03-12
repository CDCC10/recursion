package OOP.exercise6;


abstract public class Seeker {
    /**
     * Method that searches for data in the collection
     * @param collection -  where it will be searched
     * @param data - the data to be sought
     */
    abstract public Comparable search(Collection collection, Comparable data);
}
