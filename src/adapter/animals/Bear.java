package adapter.animals;
/**
 * Represents a real-life bear.
 *
 * DO NOT EDIT THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 */
public class Bear extends Animal
{
    private String bearSpecies;

    /**
     * Creates a bear object
     * @param avgLifeSpan the average life span
     * @param bearSpecies the bear species
     */
    public Bear(int avgLifeSpan, String bearSpecies)
    {
        super("Bear", avgLifeSpan);
        this.bearSpecies = bearSpecies;
    }

    /**
     * Gets the species of the bear
     * @return the bear species
     */
    public String getBearSpecies()
    {
        return bearSpecies;
    }

    @Override
    public String toString()
    {
        return "Bear{" +
                "bearSpecies='" + bearSpecies + '\'' +
                '}';
    }
}
