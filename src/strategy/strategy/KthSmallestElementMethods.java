package strategy.strategy;

import strategy.searching.KthSmallestElement;

public class KthSmallestElementMethods<T extends Comparable<T>> implements ISearch<T>
{
    private int positionK;

    public KthSmallestElementMethods(int positionK)
    {
        this.positionK = positionK;
    }

    @Override
    public T find(T[] array)
    {
        return array[positionK];
    }
}
