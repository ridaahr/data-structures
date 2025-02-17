package org.ies.lists;

import java.util.LinkedList;
import java.util.List;

public class List12 {
    public static void main(String[] args) {
        List<Double> doubleList = new LinkedList<>();
        doubleList.add(5.2);
        doubleList.add(8.0);
        doubleList.add(3.1);
        doubleList.add(6.0);
        doubleList.add(8.6);
        List<Double> doubleList2 = new LinkedList<>();
        doubleList2.add(3.1);
        doubleList2.add(8.0);
        doubleList2.add(6.0);
        List<Double> junction = junction(doubleList, doubleList2);
        for (var num: junction) {
            System.out.println(num);
        }
    }
    public static List<Double> junction(List<Double> numbers1, List<Double> numbers2) {
        List<Double> junctionList = new LinkedList<>();
        for (var num: numbers1) {
            if (numbers2.contains(num)) {
                junctionList.add(num);
            }
        }
        return junctionList;
    }
}
