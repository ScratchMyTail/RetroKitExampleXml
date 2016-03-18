package com.example.christerhansen.retrokitexample.Model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Created by christerhansen on 18.03.16.
 */
@Root(strict = false)
public class Temperature {
    @Attribute
    int value;

    @Attribute
    String unit;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
