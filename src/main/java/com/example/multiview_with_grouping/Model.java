package com.example.multiview_with_grouping;


import java.util.ArrayList;
import java.util.List;

/**
 * Manipulate the data
 */
public class Model {
    //fields should be private
    private List<ModelListener> subscribers;

    private List<Groupable> data;

    public Model() {
        subscribers = new ArrayList<>();
        data = new ArrayList<>();
    }


}
