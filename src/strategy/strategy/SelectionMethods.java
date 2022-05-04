package strategy.strategy;

import strategy.utilities.Sorts;

/**
 * This class is designed to implement a selection sort
 * @param <T> generic type
 * @author Jake Donaldson
 * @version 5/4/22
 */
public class SelectionMethods<T extends Comparable<T>> implements ISort<T>
{
    @Override
    public void sort(T[] array)
    {
        Sorts.selectionSort(array);
    }
}
