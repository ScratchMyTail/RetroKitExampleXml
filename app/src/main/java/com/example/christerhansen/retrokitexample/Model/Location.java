package com.example.christerhansen.retrokitexample.Model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by christerhansen on 18.03.16.
 */
@Root(strict = false)
public class Location {
    @Element
    String name;

    @Element
    String type;

    @Element
    String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
