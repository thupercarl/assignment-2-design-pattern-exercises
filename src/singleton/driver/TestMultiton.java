package singleton.driver;

import singleton.multiton.Bike;
import singleton.multiton.Style;

/**
 * This class is designed to test a Bike multiton object
 * @author Jake Donaldson
 * @version 5/3/22
 */
public class TestMultiton
{
    /**
     * Runs tests on Bike multiton object
     * @param args String[] representing any arguments passed into the Driver
     */
    public static void main(String[] args)
    {
        Bike myBikeOne = Bike.getInstance(Style.MOUNTAIN);
        Bike myBikeTwo = Bike.getInstance(Style.RACE);
        Bike myBikeThree = Bike.getInstance(Style.BMX);
        Bike myBikeFour = Bike.getInstance(Style.BMX);

        System.out.println(myBikeOne);
        System.out.println(myBikeTwo);
        System.out.println(myBikeThree);
        System.out.println(myBikeFour);
    }
}
