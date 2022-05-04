package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

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
