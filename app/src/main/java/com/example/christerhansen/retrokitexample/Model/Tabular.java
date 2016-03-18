package com.example.christerhansen.retrokitexample.Model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by christerhansen on 18.03.16.
 */
@Root(strict=false)
public class Tabular {
    @ElementList
    List<Time> time;

    public List<Time> getTime() {
        return time;
    }

    public void setTime(List<Time> time) {
        this.time = time;
    }
}
