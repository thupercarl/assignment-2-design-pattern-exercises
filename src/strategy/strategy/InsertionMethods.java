package strategy.strategy;

import strategy.utilities.Sorts;

public class InsertionMethods<T extends Comparable<T>> implements ISort<T>
{
    @Override
    public void sort(T[] array)
    {
        Sorts.insertionSort(array);
    }
}
