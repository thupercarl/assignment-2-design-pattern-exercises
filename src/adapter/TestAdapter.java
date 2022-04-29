package adapter;

import adapter.animals.*;

public class TestAdapter
{
    public static void main(String[] args)
    {
        Animal bear = new Bear(20, "Grolar Bear");
        StuffedBear toy = new StuffedBear("wool");
        StuffedBearAdapter stuffed = new StuffedBearAdapter(toy);

        Cage pen = new Cage();

        pen.addToCage(stuffed);
    }
}
