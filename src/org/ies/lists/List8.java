package org.ies.lists;

import java.util.LinkedList;
import java.util.List;

public class List8 {
    public static void main(String[] args) {
        List<Double> doubleList = new LinkedList<>();
        doubleList.add(5.2);
        doubleList.add(8.0);
        doubleList.add(3.0);
        doubleList.add(6.0);
        System.out.println(min(doubleList));
    }
    public static Double min(List<Double> numbers) {
        if (numbers.isEmpty() == true) {
            return null;
        } else {
            var min = numbers.getFirst();
            for (var num: numbers) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
    }
}
