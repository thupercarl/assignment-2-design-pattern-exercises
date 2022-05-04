package strategy.strategy;

/**
 * This interface is designed to be used with a SortAndSearchElectricBoogaloo object
 * @param <T> generic type
 * @author Jake Donaldson
 * @version 5/4/22
 */
public interface ISearch<T>
{
    /**
     * This method is designed to find and return an object from an array
     * @param array object array to be passed in
     * @return generic type T
     */
    T find(T[] array);
}
