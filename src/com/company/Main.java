package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>(4);
        System.out.println("Введите имя : ");
        Scanner scanner = new Scanner(System.in);
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        Iterator<String> iter = name.listIterator();
        while (iter.hasNext()) {
            System.out.println("список А: " + iter.next());
        }
        System.out.println("еще раз введите имена: ");
        ArrayList<String> name1 = new ArrayList<>(4);
        name1.add(scanner.nextLine());
        name1.add(scanner.nextLine());
        name1.add(scanner.nextLine());
        name1.add(scanner.nextLine());
        name1.add(scanner.nextLine());
        Iterator<String> iterator = name1.listIterator();
        while (iterator.hasNext()) {
            System.out.println("список Б: " + iterator.next());

        }
        System.out.println("---------------------------------");
        ArrayList<String> name2 = new ArrayList<>();
        Collections.reverse(name1);
        for (int i = 0; i < name1.size(); i++) {
            name2.add(name.get(i));
            name2.add(name1.get(i));
        }
        Iterator<String> iteratotr = name2.listIterator();
        while (iteratotr.hasNext()) {
            System.out.println("список C: " + iteratotr.next());
        }
        System.out.println("-----------------------------------");
        Collections.addAll(name2);
        System.out.println("Список С после сортировки по длине");
        Collections.sort(name2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        iter = name2.iterator();
        while (iter.hasNext()) {
            String c2 = iter.next();
            System.out.println(c2);
        }
    }
}

