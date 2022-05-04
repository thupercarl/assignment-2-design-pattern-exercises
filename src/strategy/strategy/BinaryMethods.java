package strategy.strategy;

/**
 * This class is designed to implement a binary search
 * @param <T> generic type
 * @author Jake Donaldson
 * @version 5/4/22
 */
public class BinaryMethods<T extends Comparable<T>> implements ISearch<T>
{
    private T search;

    /**
     * This method constructs a BinaryMethods object
     * @param search generic type representing search target
     */
    public BinaryMethods(T search)
    {
        this.search = search;
    }

    @Override
    public T find(T[] array)
    {
        if(binarySearch(array) == -1)
        {
            return null;
        }
        else
        {
            return search;
        }
    }

    private int binarySearch(T[] array)
    {
        int low = 0;
        int high = array.length - 1;

        while (low <= high)
        {
            int mid = (low + high) / 2;
            int compare = array[mid].compareTo(search);
            if (compare == 0)
            {
                return mid;
            }
            else if (compare > 0)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "BinaryMethods{" +
                "search=" + search +
                '}';
    }
}
