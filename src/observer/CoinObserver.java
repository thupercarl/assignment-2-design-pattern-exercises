package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * This class defines an CoinObserver object designed to observe a Coin class
 * @author Jake Donaldson
 * @version 5/4/22
 */
public class CoinObserver implements PropertyChangeListener
{

    @Override
    public void propertyChange(PropertyChangeEvent evt)
    {
        if(evt.getNewValue() instanceof Boolean)
        {
            boolean result = (Boolean) evt.getNewValue();
            if(result) { System.out.println("Coin Flipped Heads!"); }
            else { System.out.println("Coin flipped Tails!"); }
        }
        else
        {
            System.out.println("Coin type change: " + evt.getNewValue() + " from " + evt.getOldValue());
        }

    }
}
