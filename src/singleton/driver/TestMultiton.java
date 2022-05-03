package singleton.driver;

import singleton.multiton.Bike;
import singleton.multiton.Style;

public class TestMultiton
{
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
