package org.ies.lists;

import java.util.LinkedList;
import java.util.List;

public class List5 {
    public static void main(String[] args) {
        List<Double> doubleList = new LinkedList<>();
        doubleList.add(5.2);
        doubleList.add(8.0);
        doubleList.add(3.0);
        doubleList.add(6.0);
        System.out.println(sum(doubleList));
    }
    public static Double sum(List<Double> numbers) {
        var result = 0.0;
        for (var num: numbers) {
            result = result + num;
        } return result;
    }
}