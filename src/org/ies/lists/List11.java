package org.ies.lists;

import java.util.LinkedList;
import java.util.List;

public class List11 {
    public static void main(String[] args) {
        List<Double> doubleList = new LinkedList<>();
        doubleList.add(5.2);
        doubleList.add(8.0);
        doubleList.add(3.1);
        doubleList.add(6.0);
        List<Double> doubleList2 = new LinkedList<>();
        doubleList2.add(7.1);
        doubleList2.add(1.5);
        doubleList2.add(9.0);
        doubleList2.add(6.0);
        List<Double> union = union(doubleList, doubleList2);
        for (var num: union) {
            System.out.println(num);
        }
    }

    public static List<Double> union(List<Double> numbers1, List<Double> numbers2) {
       List<Double> unionList = new LinkedList<>();
        for (int i = 0; i < numbers1.size(); i++) {
            unionList.add(numbers1.get(i));
        }
        for (int i = 0; i < numbers2.size(); i++) {
            unionList.add(numbers2.get(i));
        }
        return unionList;
    }
}