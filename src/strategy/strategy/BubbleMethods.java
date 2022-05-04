package strategy.strategy;

import strategy.utilities.Sorts;

/**
 * This class is designed to implement a BubbleSort
 * @param <T> generic type
 * @author Jake Donaldson
 * @version 5/4/22
 */
public class BubbleMethods<T extends Comparable<T>> implements ISort<T>
{
    @Override
    public void sort(T[] array)
    {
        Sorts.bubbleSort(array);
    }
}
