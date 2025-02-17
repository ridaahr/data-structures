package org.ies.lists;

import java.util.LinkedList;
import java.util.List;

public class List13 {
    public static void main(String[] args) {
        List<Double> doubleList = new LinkedList<>();
        doubleList.add(5.2);
        doubleList.add(8.0);
        doubleList.add(3.1);
        doubleList.add(6.0);
        List<Double> doubleList2 = new LinkedList<>();
        doubleList2.add(8.0);
        doubleList2.add(6.0);
        removeAll(doubleList, doubleList2);
        for (var num: doubleList) {
            System.out.println(num);
        }
    }
    public static List<Double> removeAll(List<Double> numbers , List<Double> numbersToRemove) {
        for (int i = 0; i < numbers.size(); i++) {
            Double number = numbers.get(i);
            if (numbersToRemove.contains(number)) {
                numbers.remove(i);
            }
        }
        return numbers;
    }
}
