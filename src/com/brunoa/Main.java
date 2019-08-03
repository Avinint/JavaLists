package com.brunoa;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilliams = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);


        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilliams);

        Iterator iter = list.iterator();
        System.out.print("HEAD ->");
        while(iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");

        list.add(billEnd);

        iter = list.iterator();
        System.out.print("HEAD ->");
        while(iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");

        list.removeFirst();

        iter = list.iterator();
        System.out.print("HEAD ->");
        while(iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");

        list.removeLast();

        iter = list.iterator();
        System.out.print("HEAD ->");
        while(iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");

        /* Doubly Linked List */
//        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
//        list.addToFront(janeJones);
//        list.addToFront(johnDoe);
//        list.addToFront(marySmith);
//        list.addToFront(mikeWilliams);
//        list.printList();
//        System.out.println(list.getSize());
//
//        Employee billEnd = new Employee("Bill", "End", 666);
//        list.addToEnd(billEnd);
//        list.printList();
//        System.out.println(list.getSize());
//
//        list.removeFromEnd();
//        list.printList();
//        System.out.println(list.getSize());

        /* Single Linked List */
//        EmployeeLinkedList list = new EmployeeLinkedList();
//        list.addToFront(janeJones);
//        list.addToFront(johnDoe);
//        list.addToFront(marySmith);
//        list.addToFront(mikeWilliams);
//        list.printList();
//        list.remove();
//        System.out.println(list.getSize());
//        list.printList();

        /*  ArrayList / Vector */
//        List<Employee> employees = new Vector<>();
//        employees.add(janeJones);
//        employees.add(johnDoe);
//        employees.add(marySmith);
//        employees.add(mikeWilliams);

//        employees.forEach(employee -> System.out.println(employee));
//        System.out.println(employees.get(1));
//        System.out.println(employees.isEmpty());

//        employees.set(1, new Employee("John", "Adams", 4568));
//        employees.forEach(employee -> System.out.println(employee));
//        System.out.println(employees.size());
//        employees.add(3, new Employee("John", "Doe", 456));
//        employees.forEach(employee -> System.out.println(employee));

//        Employee[] employeeArray = employees.toArray(new Employee[employees.size()]);
//        for (Employee employee: employeeArray) {
//            System.out.println(employee);
//        }

//        System.out.println(employees.contains(new Employee("Mary", "Smith", 22)));
//
//        System.out.println(employees.indexOf(new Employee("John", "Doe", 456)));
//        employees.remove(2);
//        employees.forEach(employee -> System.out.println(employee));



    }
}
