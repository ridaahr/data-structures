package org.ies.lists;

import java.util.LinkedList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();
        lista.add("Hola");
        lista.add("Adiós");
        lista.add("¿Qué tal?");
        addAtBeggining(lista, "Ey");

        for (var string: lista) {
            System.out.println(string);
        }

    }
    public static void addAtBeggining(List<String> list, String value) {
        list.addFirst(value);
    }
}
