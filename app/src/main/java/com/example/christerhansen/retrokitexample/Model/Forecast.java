package com.example.christerhansen.retrokitexample.Model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by christerhansen on 18.03.16.
 */
@Root(strict = false)
public class Forecast {
    @ElementList
    List<Time> tabular;

    public List<Time> getTabular() {
        return tabular;
    }

    public void setTabular(List<Time> tabular) {
        this.tabular = tabular;
    }
}
