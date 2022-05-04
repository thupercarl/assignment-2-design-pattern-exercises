package strategy.strategy;

/**
 * This class is designed to swap out and use different strategies
 * @param <T> generic type
 * @author Jake Donaldson
 * @version 5/4/22
 */
public class SortAndSearchElectricBoogaloo<T extends Comparable<T>>
{

    private ISort<T> sortable;
    private ISearch<T> searchable;

    /**
     * This method constructs a SortAndSearchElectricBoogaloo object
     * @param sortable interface representing any applicable sorting methods
     * @param searchable interface representing any applicable searching methods
     */
    public SortAndSearchElectricBoogaloo(ISort<T> sortable, ISearch<T> searchable)
    {
        this.sortable = sortable;
        this.searchable = searchable;
    }

    /**
     * This method sorts an array and returns an object back depending on the type of search
     * passed into the SortAndSearchElectricBoogaloo object's constructor
     * @param array array to be sorted and searched through
     * @return generic type T representing the result of a search
     */
    public T find(T[] array)
    {
        sortable.sort(array);
        return searchable.find(array);
    }

    @Override
    public String toString() {
        return "SortAndSearchElectricBoogaloo{" +
                "sortable=" + sortable +
                ", searchable=" + searchable +
                '}';
    }
}
