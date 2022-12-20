package com.example.multiview_with_grouping;


import java.util.ArrayList;

/**
 * composite widget?
 */
public class Triangle implements Groupable {

    double curx, cury;

    @Override
    public void move(double dx, double dy) {
        curx += dx;
        cury += dy;
    }

    @Override
    public boolean hasChildren() {
        return false;
    }

    @Override
    public double getTop() {
        return 0;
    }

    @Override
    public double getBottom() {
        return 0;
    }

    @Override
    public double getLeft() {
        return 0;
    }

    @Override
    public double getRight() {
        return 0;
    }

    @Override
    public ArrayList<Groupable> getChildren() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public void duplicate() {

    }
}
