package strategy.strategy;

/**
 * This class is designed to implement a KthSmallestElement search
 * @param <T> generic type
 * @author Jake Donaldson
 * @version 5/4/22
 */
public class KthSmallestElementMethods<T extends Comparable<T>> implements ISearch<T>
{
    private int positionK;

    /**
     * This method constructs a KthSmallestElementMethods object
     * @param positionK the position of K in an array
     */
    public KthSmallestElementMethods(int positionK)
    {
        this.positionK = positionK;
    }

    @Override
    public T find(T[] array)
    {
        return array[positionK];
    }

    @Override
    public String toString() {
        return "KthSmallestElementMethods{" +
                "positionK=" + positionK +
                '}';
    }
}
