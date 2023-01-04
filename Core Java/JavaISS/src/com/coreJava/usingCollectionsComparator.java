package com.coreJava;

import java.util.*;

public class usingCollectionsComparator {
    public static void main(String[] args) {
    	int[] arr= {10,4,6,7,8,2};//Sorting Primitive list
    	Arrays.sort(arr);
    	System.out.println(Arrays.toString(arr));
    	
        List<Points> list = new ArrayList<Points>();
        list.add(new Points(10, 20));
        list.add(new Points(5, 6));
        list.add(new Points(10, 9));
        Collections.sort(list, new MyCmp());
        for (Points p : list) {
            System.out.println(p.x + " " + p.y);
        }
    }
}

class Points {
    int x, y;

    Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class MyCmp implements Comparator<Points> {
    public int compare(Points p1, Points p2) {
        return p1.x - p2.x;
    }
}
