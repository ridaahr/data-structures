package org.ies.lists;

import java.util.LinkedList;
import java.util.List;

public class List4 {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(5);
        integerList.add(8);
        integerList.add(3);
        integerList.add(6);
        System.out.println(last(integerList));
        List<Integer> integerList2 = new LinkedList<>();
        System.out.println(last(integerList2));
    }
    public static Integer last(List<Integer> list) {
        if (list.isEmpty() == true) {
            return null;
        } else {
            return list.get(list.size()-1);
        }
    }
}
