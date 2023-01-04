package com.coreJava;

import java.util.*;

class usingCollectionsComparable {
    public static void main(String args[]) {
        List<Point> list = new ArrayList<Point>();
        list.add(new Point(10, 20));
        list.add(new Point(5, 6));
        list.add(new Point(10, 9));
        Collections.sort(list, Collections.reverseOrder());
        for (Point p : list) {
            System.out.println(p.x + " " + p.y);
        }
    }
}

class Point implements Comparable<Point> {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point p) {
        return this.x - p.x;
    }

}