package com.zheng;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 88);
        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        Iterator iter = list.iterator();
        System.out.println("HEAD -> ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");

        //also prints the list as Iterator
//        for(Employee employee: list) {
//            System.out.println(employee);
        list.add(billEnd);
        // add method in the List Interface add items to the end of the Linkedlist
        iter = list.iterator();
        System.out.println("HEAD -> ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");
    }
}
