package strategy.strategy;

public class SortAndSearchElectricBoogaloo<T extends Comparable<T>>
{

    private ISort<T> sortable;
    private ISearch<T> searchable;

    public SortAndSearchElectricBoogaloo(ISort<T> sortable, ISearch<T> searchable)
    {
        this.sortable = sortable;
        this.searchable = searchable;
    }

    public T find(T[] array)
    {
        sortable.sort(array);
        return searchable.find(array);
    }
}
