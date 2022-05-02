package adapter;

import adapter.animals.*;

/**
 * Driver class that can test the adapter class that was written
 * @author Jake Donaldson
 * @version 5/2/22
 */
public class TestAdapter
{
    public static final int AVG_LIFE_SPAN = 20;

    /**
     * runs tests on Animal and Cage objects
     * @param args String[] representing any arguments passed into the Driver
     */
    public static void main(String[] args)
    {
        //create some animals
        Animal bear = new Bear(AVG_LIFE_SPAN, "Grolar Bear");
        StuffedBear stuffed = new StuffedBear("wool");
        Animal adapter = new StuffedBearAdapter("Teddy", 100, stuffed);

        System.out.println();

        //print them out
        System.out.println(bear);
        System.out.println(stuffed);
        System.out.println(adapter);

        System.out.println();

        //put them in a cage, then remove them
        Cage pen = new Cage();
        pen.addToCage(bear);
        pen.emptyCage();
        pen.addToCage(adapter);
        pen.emptyCage();
    }
}
