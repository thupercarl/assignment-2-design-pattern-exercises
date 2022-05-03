package strategy.strategy;

import strategy.searching.BinarySearch;

public class BinaryMethods<T extends Comparable<T>> implements ISearch<T>
{
    private T search;

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
}
