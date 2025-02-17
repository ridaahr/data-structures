package org.ies.lists;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class List9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> integerList = createList();
        for (var num: integerList) {
            System.out.println(num);
        }
    }
    public static List<Integer> createList() {
        List<Integer> integerList = new LinkedList<>();
        String option = "";
        do {
            System.out.println("¿Quieres un número?");
            option = scanner.nextLine();
            if (option.equals("si")) {
                System.out.println("Introduce el número:");
                var num = scanner.nextInt();
                scanner.nextLine();
                integerList.add(num);
            }
        } while (!option.equals("no"));
        return integerList;
    }
}
