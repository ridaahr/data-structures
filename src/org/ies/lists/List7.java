package org.ies.lists;

import java.util.LinkedList;
import java.util.List;

public class List7 {
    public static void main(String[] args) {
        List<Double> doubleList = new LinkedList<>();
        doubleList.add(5.2);
        doubleList.add(8.0);
        doubleList.add(3.0);
        doubleList.add(6.0);
        System.out.println(max(doubleList));
    }
    public static Double max(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return null;
        } else {
            var max = numbers.getFirst();
            for (var num: numbers) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
    }
}
