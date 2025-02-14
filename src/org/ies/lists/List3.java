package org.ies.lists;

import java.util.LinkedList;
import java.util.List;

public class List3 {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(first(lista));
        List<Integer> lista2 = new LinkedList<>();
        System.out.println(first(lista2));
    }
    public static Integer first(List<Integer> list) {
        if (list.isEmpty() == true) {
            return null;
        } else {
            return list.get(0);
        }
    }
}
