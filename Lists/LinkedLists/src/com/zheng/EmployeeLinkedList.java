package com.zheng;

public class EmployeeLinkedList {
    //only works with EmployeeNode
    private EmployeeNode head;
    //keeps track of the number of nodes
    private int size;


    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while (current !=null) {
            System.out.print(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
