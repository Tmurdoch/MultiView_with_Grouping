package com.example.multiview_with_grouping;


import java.util.ArrayList;
import java.util.List;

/**
 * Manipulate the data
 */
public class Model {
    //fields should be private
    private List<ModelListener> subscribers;

    public Model() {
        subscribers = new ArrayList<>();
    }
}
