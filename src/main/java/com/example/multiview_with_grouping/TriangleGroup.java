package com.example.multiview_with_grouping;

import java.util.ArrayList;

public class TriangleGroup implements Groupable {
    double left, right, top, bottom;

    @Override
    public ArrayList<Groupable> getChildren() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public void move(double dx, double dy) {

    }

    @Override
    public boolean hasChildren() {
        return true;
    }

    @Override
    public double getTop() {
        return top;
    }

    @Override
    public double getBottom() {
        return bottom;
    }

    @Override
    public double getLeft() {
        return left;
    }

    @Override
    public double getRight() {
        return right;
    }

    @Override
    public void duplicate() {

    }
}
