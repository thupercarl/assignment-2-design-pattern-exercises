package adapter.animals;

public class StuffedBearAdapter implements IAnimal
{
    private StuffedBear adaptee;

    public StuffedBearAdapter(StuffedBear adaptee)
    {
        this.adaptee = adaptee;
    }

    @Override
    public String getType() {
        return "Stuffed Bear";
    }
}
