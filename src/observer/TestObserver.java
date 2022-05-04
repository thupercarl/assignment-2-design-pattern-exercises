package observer;

public class TestObserver
{
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
