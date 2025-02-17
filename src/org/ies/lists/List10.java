package org.ies.lists;

import java.util.LinkedList;
import java.util.List;

public class List10 {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(5);
        integerList.add(8);
        integerList.add(3);
        integerList.add(6);
        List<Integer> sum = sum10(integerList);
        for (var num: sum) {
            System.out.println(num);
        }
    }
    public static List<Integer> sum10(List<Integer> numbers) {
        List<Integer> newList = new LinkedList<>();
        for (var num: numbers) {
            newList.add(num + 10);
        } return newList;
    }
}
