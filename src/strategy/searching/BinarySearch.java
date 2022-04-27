package strategy.searching;

import strategy.strategy.SortAndSearch;

/**
 * Performs the binary search algorithm on an input array
 * after sorting the contents of the array
 * @param <T> the generic type
 *
 * DO NOT EDIT THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 */
public abstract class BinarySearch<T extends Comparable<T>> extends SortAndSearch<T>
{
    private T search;

    /**
     * Registers the value to search for when calling find().
     * @param search the search value
     */
    public BinarySearch(T search)
    {
        this.search = search;
    }

    @Override
    public T find(T[] array)
    {
        sort(array);
        int index = binarySearch(array);
        if (index != -1)
        {
            return array[index];
        }
        return null;
    }

    //the binary search algorithm
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

    /**
     * Sort is implemented in child classes.
     * @param array the array to sort
     */
    public abstract void sort(T[] array);

    @Override
    public String toString()
    {
        return "BinarySearch{" +
            "search=" + search +
            '}';
    }
}
