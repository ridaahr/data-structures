package org.ies.lists;

import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class List1 {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("Hola");
        stringList.add("Adiós");
        stringList.add("¿Qué tal?");
        for (var string: stringList) {
            System.out.println(string);
        }
    }
}