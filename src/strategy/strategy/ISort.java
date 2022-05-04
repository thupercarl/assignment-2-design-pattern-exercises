package strategy.strategy;

/**
 * This interface is designed to be used with a SortAndSearchElectricBoogaloo object
 * @param <T> generic type
 * @author Jake Donaldson
 * @version 5/4/22
 */
public interface ISort<T>
{
    /**
     * This method is designed to sort an array
     * @param array object array to be passed in
     */
    void sort(T[] array);
}
