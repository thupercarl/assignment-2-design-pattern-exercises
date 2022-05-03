package strategy.strategy;

import strategy.searching.FindSmallest;

public class FindSmallestMethods<T extends Comparable<T>> implements ISearch<T>
{
    @Override
    public T find(T[] array)
    {
        //assume array is sorted
        //return first element
        return array[0];
    }
}
