package singleton.multiton;

import java.util.HashMap;
import java.util.Map;

public class Bike
{
    private String model;
    private String type;
    private boolean kickstand;
    private Style style;
    private static Map<Style, Bike> multiton = new HashMap<>();

    //multiton pattern being applied
    private static Bike instance;

    private Bike(String model, String type, boolean kickstand, Style style) {
        this.model = model;
        this.type = type;
        this.kickstand = kickstand;
        this.style = style;

    }

    //access my multiton
    public static Bike getInstance(Style style)
    {
        //lazy initialization pattern (instantiate object when it's needed)
        if(!multiton.containsKey(style))
        {
            instance = new Bike("default", "default", true, style);
            multiton.put(style, instance);
        }

        return instance;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isKickstand() {
        return kickstand;
    }

    public void setKickstand(boolean kickstand) {
        this.kickstand = kickstand;
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
