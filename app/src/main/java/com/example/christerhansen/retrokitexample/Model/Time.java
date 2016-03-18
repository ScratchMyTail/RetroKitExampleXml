package com.example.christerhansen.retrokitexample.Model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by christerhansen on 18.03.16.
 */
@Root(strict = false)
public class Time {

    @Element
    Temperature temperature;

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }
}
