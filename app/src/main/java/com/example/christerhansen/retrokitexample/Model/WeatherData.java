package com.example.christerhansen.retrokitexample.Model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by christerhansen on 18.03.16.
 */
@Root(strict=false)
public class WeatherData {
    @Element
    Location location;

    @Element
    Forecast forecast;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
