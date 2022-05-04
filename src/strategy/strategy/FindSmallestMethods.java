package strategy.strategy;

/**
 * This class is designed to find the smallest object in an array
 * @param <T> generic type
 * @author Jake Donaldson
 * @version 5/4/22
 */
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
