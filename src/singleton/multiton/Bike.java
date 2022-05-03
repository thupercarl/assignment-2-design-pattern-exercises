package singleton.multiton;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a multiton that stores Bike objects
 * @author Jake Donaldson
 * @version 5/3/22
 */
public class Bike
{
    private String model;
    private String type;
    private boolean kickstand;
    private Style style;
    private static Map<Style, Bike> multiton;

    /**
     * This method constructs a Bike object
     * @param model String the model of bike
     * @param type String the type of bike
     * @param kickstand boolean if the bike has a kickstand
     * @param style enum what style of bike it is
     */
    private Bike(String model, String type, boolean kickstand, Style style) {
        this.model = model;
        this.type = type;
        this.kickstand = kickstand;
        this.style = style;

    }

    /**
     * This method returns an instance (singleton) from the multiton
     * @param style enum what style of bike to return
     * @return Bike objects matching the enum provided
     */
    public static Bike getInstance(Style style)
    {
        //lazy initialization pattern (instantiate object when it's needed)
        if(multiton == null)//if map is null
        {
            multiton = new HashMap<>();

            //multiton pattern being applied
            Bike instance = new Bike("Trek", "Martin", true, Style.MOUNTAIN);
            multiton.put(Style.MOUNTAIN, instance);
            instance = new Bike("Schwinn", "Race Bike", true, Style.RACE);
            multiton.put(Style.RACE, instance);
            instance = new Bike("Huffy", "BMX Bike", true, Style.BMX);
            multiton.put(Style.BMX, instance);
        }
        return multiton.get(style);//return a bike from the map
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", kickstand=" + kickstand +
                ", style=" + style +
                '}';
    }
}
