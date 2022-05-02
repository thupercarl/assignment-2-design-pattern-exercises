package adapter.animals;

/**
 * This class allows a StuffedBear object to work with Cage objects
 * @author Jake Donaldson
 * @version 5/2/22
 */
public class StuffedBearAdapter extends Animal
{
    private StuffedBear adaptee;

    /**
     * This method creates a StuffedBearAdapter object
     * @param type refers to superclass for species
     * @param avgLifeSpan refers to superclass for lifespan
     * @param adaptee the StuffedBear object to be adapted
     */
    public StuffedBearAdapter(String type, int avgLifeSpan, StuffedBear adaptee)
    {
        super(type, avgLifeSpan);
        this.adaptee = adaptee;
    }

    @Override
    public String toString() {
        return "StuffedBearAdapter{" +
                "adaptee=" + adaptee +
                '}';
    }
}
