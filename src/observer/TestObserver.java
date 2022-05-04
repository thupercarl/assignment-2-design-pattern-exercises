package observer;

/**
 * This class is designed to test a CoinObserver class
 * @author Jake Donaldson
 * @version 5/4/22
 */
public class TestObserver
{
    /**
     * This method runs tests on a Coin object with CoinObserver objects
     * @param args String[] representing the arguments passed into the driver
     */
    public static void main(String[] args)
    {
        Coin myCoin = new Coin();
        myCoin.setCoinType("penny");

        CoinObserver faceObserver = new CoinObserver();
        CoinObserver typeObserver = new CoinObserver();

        myCoin.addChangeListener("coinsFace", faceObserver);
        myCoin.addChangeListener("coinType", typeObserver);

        myCoin.flip();
        myCoin.setCoinType("dime");
        myCoin.flip();
        myCoin.setCoinType("nickel");
    }
}
