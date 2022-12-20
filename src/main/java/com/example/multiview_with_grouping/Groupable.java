package com.example.multiview_with_grouping;

import java.util.ArrayList;

public interface Groupable {
    void move(double dx, double dy);

    boolean hasChildren();

    double getTop();

    double getBottom();

    double getLeft();

    double getRight();

    ArrayList<Groupable> getChildren();

    boolean contains(double x, double y);

    void duplicate();
}
